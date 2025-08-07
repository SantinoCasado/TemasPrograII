package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import models.Auto;
import models.Camioneta;
import models.Moto;
import models.Vehiculo;

public class FormularioController implements Initializable {
    //ChoiceBox
    @FXML
    private ChoiceBox<String> cbTipo;
  
    //Botones
    @FXML
    private Button btnCancelar;
    @FXML
    private Button btnConfirmar;
    
    //Label del dato extra
    @FXML
    private Label lblDatoExtra;
    
    //Texts Fields
    @FXML
    private TextField txtCantHoras;
    @FXML
    private TextField txtDatoExtra;
    @FXML
    private TextField txtMarca;
    @FXML
    private TextField txtModelo;
    @FXML
    private TextField txtPatente;
    @FXML
    private TextField txtPrecio;
    
    //Objetos que voy a usar
    private Vehiculo vehiculo;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Ininicalizo los valores predeterminados del choiseBox
        this.cbTipo.getItems().addAll("AUTO", "CAMIONETA", "MOTO");
        //Le doy un valor inicial
        this.cbTipo.setValue("AUTO");
    }    
    
    //Metodos
    @FXML
    void cambiadoTipo(ActionEvent event) {
        //Dependiento del valor del choiseBox seteo un valor al label del datoExtra
        switch(cbTipo.getValue()){
            
            case "AUTO" -> lblDatoExtra.setText("CANTIDAD DE PUERTAS");
            
            case "MOTO" -> lblDatoExtra.setText("CILINDRADA");
            
            case "CAMIONETA" -> lblDatoExtra.setText("CAPACIDAD DE CARGA");
        
        }
    }    

    @FXML
    void cancelar(ActionEvent event) {
        this.cerrar();
    }

    @FXML
    void confirmar(ActionEvent event) {
        
        // Obtiene los datos del formulario
        String tipo = cbTipo.getValue();
        String patente = txtPatente.getText();
        String marca = txtMarca.getText();
        String modelo = txtModelo.getText();
        int horas = Integer.parseInt(txtCantHoras.getText());
        Double precio = Double.parseDouble((txtPrecio.getText()));
        int datoExtra = Integer.parseInt(txtDatoExtra.getText());
        
        // Si vehiculo != null, significa que está editando un vehículo existente:
        if (vehiculo != null) {
            
            //Actualiza sus atributos comunes.
            vehiculo.setMarca(marca);
            vehiculo.setModelo(modelo);
            vehiculo.setCantHoras(horas);
            vehiculo.setPrecioHora(precio);
            
            //Según el tipo, castea el objeto y actualiza el atributo específico (cantPuertas, cilindrada, capacidadCarga).
            switch(tipo){
                case "AUTO" -> ((Auto)vehiculo).setCantPuertas(datoExtra);

                case "MOTO" -> ((Moto)vehiculo).setcilindrada(datoExtra);

                case "CAMIONETA" -> ((Camioneta)vehiculo).setCapacidadCarga(datoExtra);
            }
        }
        // Si vehiculo == null, entonces está creando un nuevo vehículo:
        else{
            
            //Usa el switch(tipo) para instanciar la subclase correspondiente (Auto, Moto, Camioneta) con todos los datos.
            switch(tipo){
            
                case "AUTO" -> this.vehiculo = new Auto(datoExtra, patente, marca, modelo, horas, precio);
            
                case "MOTO" -> this.vehiculo = new Moto(datoExtra, patente, marca, modelo, horas, precio);
            
                case "CAMIONETA" -> this.vehiculo = new Camioneta(datoExtra, patente, marca, modelo, horas, precio);                        
            
            }
        }
        this.cerrar();
    }
    
    //Get vehiculo (Necesito la informacion para guardarla en la otra vista)
    public Vehiculo getVehiculo(){
        return this.vehiculo;
    }
    
    //Metodo que cierra el formulario
    @FXML
     private void cerrar(){
        Stage stage = (Stage)btnCancelar.getScene().getWindow();
        stage.close();
    }
     
     
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo; 
        if(vehiculo != null){
            this.txtPatente.setDisable(true);
            this.txtMarca.setText(vehiculo.getMarca());
            this.txtModelo.setText(vehiculo.getModelo());
            this.txtCantHoras.setText(String.valueOf(vehiculo.getCantHoras()));
            this.txtPrecio.setText(String.valueOf(vehiculo.getPrecioHora()));
            
            if( vehiculo instanceof Auto auto) {
                this.txtDatoExtra.setText(String.valueOf(auto.getCantPuertas()));
                cbTipo.setValue("AUTO");
            }
            if (vehiculo instanceof Camioneta camioneta) {
                this.txtDatoExtra.setText(String.valueOf(camioneta.getCapacidadCarga()));
                cbTipo.setValue("CAMIONETA");
            }
            if (vehiculo instanceof Moto moto){
                this.txtDatoExtra.setText(String.valueOf(moto.getcilindrada()));
                cbTipo.setValue("MOTO");
            }
        }
    }
    

    
}
