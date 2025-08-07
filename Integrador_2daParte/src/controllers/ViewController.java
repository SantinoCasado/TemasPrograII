package controllers;

import Excepciones.VehiculoRepetidoException;
import interfaces.ISerializableCsv;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import models.*;

public class ViewController implements Initializable {
    
    //Botnes
    @FXML
    private Button btnAgregar;
    @FXML
    private Button btnEliminar;
    @FXML
    private Button btnModificar;
    
    //listView
    @FXML
    private ListView<Vehiculo> listViewVehiculos;
    
    //Atributos
    private Estacionamiento estacionamiento;
    
    private CSVUtilsGeneric<ISerializableCsv> herramientaCsv;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         estacionamiento = new Estacionamiento();
         herramientaCsv = new CSVUtilsGeneric<>();
         this.LeerArchivo();
    }
    
    //Metodos
    @FXML
    void agregar(ActionEvent event) {
        this.AbrirFormulario(null);
    }

    @FXML
    void eliminar(ActionEvent event) {

        Vehiculo vehiculo = listViewVehiculos.getSelectionModel().getSelectedItem();
        

         if (vehiculo != null) {
             Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
             alerta.setTitle("Confirmar eliminacion");
             alerta.setHeaderText("Estas seguro que quiere eliminar al vehiculo?");
             alerta.setContentText(vehiculo.toString());
             Optional<ButtonType> resultado = alerta.showAndWait();

             if (resultado.isPresent() && resultado.get()== ButtonType.OK) {     //Verifico que alla un resultado y que sea "OK"
                 estacionamiento.eliminarVehiculo(vehiculo);
                 this.refrescarVista();
             }
         }
    }

    @FXML
    void modificar(ActionEvent event) {
        Vehiculo vehiculo = listViewVehiculos.getSelectionModel().getSelectedItem();

         if(vehiculo != null) {
             this.AbrirFormulario(vehiculo);
         }
    }
   

     private void AbrirFormulario(Vehiculo vehiculo) {
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Views/Formulario.fxml"));
    
            Scene scene = new Scene(loader.load());
            FormularioController controlador = loader.getController();
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);               
            controlador.setVehiculo(vehiculo);      
            stage.showAndWait();
            Vehiculo resultado = controlador.getVehiculo();    
   

                if(resultado != null) {                        
                    if(vehiculo == null){       
                        if (!estacionamiento.getVehiculos().contains(resultado)){       
                            this.estacionamiento.agregarVehiculo(resultado);
                        }
                    }
                }
                this.refrescarVista();
        }
        catch(IOException | VehiculoRepetidoException e){
            System.out.println("Error:" + e.getMessage());
        }
    }
     
    //Refrescao la vista
    public void refrescarVista(){
        this.listViewVehiculos.getItems().clear();
        this.listViewVehiculos.getItems().addAll(estacionamiento.getVehiculos());
    }
    
    //Metodos para CSV
    public void GuardarArchivo() {
        //Crea una lista data que solo contendrá objetos que implementan la interfaz ISerializableCsv.
        ArrayList<ISerializableCsv> data = new ArrayList<>();
        for(Vehiculo item : this.estacionamiento.getVehiculos()){       //Itera los vehículos del estacionamiento.
            if(item instanceof ISerializableCsv vehiculo){                      //Si el vehículo implementa esa interfaz, lo agrega a data.
                data.add(vehiculo);
            }
        }
        herramientaCsv.escribirCSV(data);       //Llama a herramientaCsv.escribirCSV(data), que graba todo en el archivo CSV usando toCSV()
    }

    public void LeerArchivo() {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        ArrayList<String> resultado = herramientaCsv.leerCSV("datos.csv");      // Llama a leerCSV("datos.csv"), que devuelve las líneas del archivo como String.

        for (String item : resultado ) {
            if(item == null || item.isEmpty()) {        //Si está vacía o es null, la salta.
                continue;
            }
            String[] result = item.split(",");          //La separa en campos con split(",").
            Vehiculo vehiculo = null;

            if (result[6].equals("Auto")) {             //Usa result[6] para identificar el tipo: "Auto"
                vehiculo = new Auto().fromCSV(item);        //Crea la instancia correcta llamando a fromCSV(item) (técnica de deserialización).
            }

            if (result[6].equals("Camioneta")) {        //Usa result[6] para identificar el tipo:  "Camioneta"
                vehiculo = new Camioneta().fromCSV(item);
            }

            if (result[6].equals("Moto")) {         //Usa result[6] para identificar el tipo: "Moto"
                vehiculo = new Moto().fromCSV(item);
            }
            if (vehiculo != null) {             //Verifica que vehiculo no sea null antes de agregarlo a la lista.
                vehiculos.add(vehiculo);
            }
        }
        //Crea una nueva instancia de Estacionamiento (esto reinicia su estado) y le agrega todos los vehículos reconstruidos desde el archivo.
        estacionamiento = new Estacionamiento();
        estacionamiento.getVehiculos().addAll(vehiculos);
        this.refrescarVista();
    }
}
