package Controllers;

import Exceptions.ProductoFarmaceuticoRepetidoException;
import Interfaces.ISerializableCsv;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.fxml.Initializable;
import javafx.stage.Modality;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import Utilities.CsvUtilisGeneric;
import Gestor.Farmacia;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import models.Medicamento;
import models.ProductoFarmaceutico;
import models.Suplemento;

public class ViewController implements Initializable {

    @FXML
    private ListView<ProductoFarmaceutico> ListViewProductosFarmaceuticos;
    
     //Lista de personas con sus datos para poner en el visor despues
    private List<ProductoFarmaceutico> listaProductos;
    
    private Farmacia farmacia;
    
    private CsvUtilisGeneric<ISerializableCsv> herramientaCsv;
    
    //Botones
    @FXML
    private Button btnAgregar;
    @FXML
    private Button btnEliminar;
    @FXML
    private Button btnModificar;
    @FXML
    private Button btnFiltrar;
    
    //ChoiceBox

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         farmacia = new Farmacia();
         herramientaCsv = new CsvUtilisGeneric<>();
        this.LeerArchivo();
        
    }    
    
    //Metodos
    @FXML
    void agregar(ActionEvent event) {
        this.AbrirFormulario(null);
    }
    
    public static void main (String[] args){
            Application.launch();
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @FXML
    void eliminar(ActionEvent event) {
         //Chequeo que se haya seleccionado algo en mi listView
        ProductoFarmaceutico pf = this.ListViewProductosFarmaceuticos.getSelectionModel().getSelectedItem();
        
        if (pf != null) {
            //Muestro una alerta de confirmacion
            Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
            alerta.setTitle("Confirmar eliminacion");
            alerta.setHeaderText("Estas seguro de eliminar estos datos?");
            alerta.setContentText(pf.toString());            
            
            Optional<ButtonType> resultado = alerta.showAndWait();
            
            if (resultado.isPresent() && resultado.get() == ButtonType.OK) {    //Verifico que alla un resultado y que sea "OK"
                farmacia.Eliminar(pf);
            }
            this.refrescarVista();
        }        
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @FXML
    void modificar(ActionEvent event) {
         ProductoFarmaceutico producto = this.ListViewProductosFarmaceuticos.getSelectionModel().getSelectedItem();

         if(producto != null) {
             this.AbrirFormulario(producto);
         }
    }
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @FXML
    void filtrar(ActionEvent event) {
        try {
            //Cargo la scena
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Views/Filtrado.fxml"));
            Scene scene = new Scene(loader.load());
            
            //Llamo a su controlador
            FiltradoController controlador = loader.getController();
            //Listo los productos filtrados
            List<ProductoFarmaceutico> productosFiltrados = farmacia.FiltrarProductoFarmaceutico(30);
            controlador.setProductosFiltrados(productosFiltrados);

            // Lógica de filtrado y conversión a texto
            List<String> lineasAGuardar = new ArrayList<>();
            LocalDate hoy = LocalDate.now();

            for (ProductoFarmaceutico producto : productosFiltrados) {
                if (producto instanceof Medicamento medicamento) {
                    //Establezco su fecha de vencimiento
                    LocalDate vencimiento = medicamento.getFechaVencimiento();
                    
                    if (vencimiento != null && //Si no es null, no anterior a la de hoy y no es posterior a los 30 dias
                        !vencimiento.isBefore(hoy) &&
                        !vencimiento.isAfter(hoy.plusDays(30))) {

                        lineasAGuardar.add(medicamento.toString());
                    }
                }
            }

        // Guardado sin lógica
        Utilities.TxTSave.guardarEnEscritorio(lineasAGuardar);

        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Productos próximos a vencer");
        stage.setScene(scene);
        stage.showAndWait();

    } catch (IOException e) {
        System.out.println("Error al cargar el formulario de filtrado: " + e.getMessage());
    }
}
    
    public void refrescarVista(){
        this.ListViewProductosFarmaceuticos.getItems().clear();
        this.ListViewProductosFarmaceuticos.getItems().addAll(farmacia.Listar());
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     private void AbrirFormulario(ProductoFarmaceutico producto) {
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Views/Formulario.fxml"));
    
            Scene scene = new Scene(loader.load());
            FormularioController controlador = loader.getController();
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);               
            controlador.setProducto(producto);      
            stage.showAndWait();
            ProductoFarmaceutico resultado = controlador.getProductoFarmaceutico();    
   

                if(resultado != null) {                        
                    if(producto == null){       
                        if (!farmacia.Listar().contains(resultado)){       
                            this.farmacia.Agregar(resultado);
                        }
                    }
                }
                this.refrescarVista();
        }
        catch(IOException | ProductoFarmaceuticoRepetidoException e){
            System.out.println("Error:" + e.getMessage());
        }
    }
     
     
     public void GuardarArchivo() {
        ArrayList<ISerializableCsv> data = new ArrayList<>();
        
        for (ProductoFarmaceutico item : this.farmacia.Listar()) {
            System.out.println("Producto encontrado: " + item);
            if (item instanceof ISerializableCsv producto) {
                System.out.println("Agregado a CSV: " + producto.toCSV());
                data.add(producto);
            } else {
                System.out.println("No implementa ISerializableCsv: " + item.getClass().getSimpleName());
            }
        }
        System.out.println("Total a escribir: " + data.size());
        herramientaCsv.escribirCSV(data);
}
    
     
     public void LeerArchivo() {
         String desktopPath = System.getProperty("user.home") + "\\OneDrive\\Escritorio";
        String archivoCsv = desktopPath + java.io.File.separator + "datos.csv";
        ArrayList<ProductoFarmaceutico> productos = new ArrayList<>();
        ArrayList<String> resultado = herramientaCsv.leerCSV(archivoCsv);      // Llama a leerCSV("datos.csv"), que devuelve las líneas del archivo como String.

        for (String item : resultado ) {
            if(item == null || item.isEmpty()) {        //Si está vacía o es null, la salta.
                continue;
            }
            String[] result = item.split(",");          //La separa en campos con split(",").
            ProductoFarmaceutico producto = null;
            
            if (item.contains("Medicamento")) {
                producto = new Medicamento().fromCSV(item);
            } 
            if (item.contains("Suplemento")) {
                producto = new Suplemento().fromCSV(item);
            }
            
            if (producto != null) {             
                productos.add(producto);
            }
        }
        //Crea una nueva instancia de Estacionamiento (esto reinicia su estado) y le agrega todos los vehículos reconstruidos desde el archivo.
        farmacia = new Farmacia();
        farmacia.Listar().addAll(productos);
        this.refrescarVista();
    }
  }
    