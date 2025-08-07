package controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import models.Persona;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;

public class ViewController implements Initializable {
    //Vinculo los controles a atributos del propio controlador 
    
    //Donde pongo los datos
    @FXML
    private ListView<Persona> listViewPersonas;
    
    //Botones
   @FXML
    private Button btnAgregar;
    @FXML
    private Button btnEliminar;
    @FXML
    private Button btnModificar;
    
    //Lista de personas con sus datos para poner en el visor despues
    private List<Persona> listaPersonas;
    
    //Es una especie de constructor
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.listaPersonas = new ArrayList<>();
    }
    
    //Viculo los manejadores onAction de los botones previamente creados en el SceenBuilder, seleccionando el boton ->Code/onAction/nombreDeLaAccion
    @FXML
    private void agregarPersona(ActionEvent a){
         this.abrirFormulario(null);  
    }

    @FXML
    private void eliminarPersona(ActionEvent a){
        //Chequeo que se haya seleccionado algo en mi listView
        Persona p = this.listViewPersonas.getSelectionModel().getSelectedItem();
        
        if (p != null) {
            //Muestro una alerta de confirmacion
            Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
            alerta.setTitle("Confirmar eliminacion");
            alerta.setHeaderText("Estas seguro de eliminar estos datos?");
            alerta.setContentText(p.toString());            
            
            Optional<ButtonType> resultado = alerta.showAndWait();
            
            if (resultado.isPresent() && resultado.get() == ButtonType.OK) {    //Verifico que alla un resultado y que sea "OK"
                this.listaPersonas.remove(p);
            }

            this.actualizarListView();
        }        

    }
    
    @FXML
    private void modificarPersona(ActionEvent a){
        //Chequeo que se haya seleccionado algo en mi listView
        Persona p = this.listViewPersonas.getSelectionModel().getSelectedItem();
        
        if (p != null) {
            this.abrirFormulario(p);  
        }
        
        this.actualizarListView();
    }
    
    //Metodo para refrescar la lista
    private void actualizarListView(){
        this.listViewPersonas.getItems().clear();
        this.listViewPersonas.getItems().addAll(this.listaPersonas);
    }
    
    private void abrirFormulario(Persona personaExistente){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/formulario.fxml"));
            
            Scene scene = new Scene(loader.load());
            
            //Me va a traer el controller al que esta asociado
            FormularioController controller = loader.getController();
            
            //Entrara la persona con sus datos y se cargaran los txtField
            controller.setPersona(personaExistente);

            Stage stage = new Stage();
            
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            
            stage.showAndWait();
            
            //Me traigo del contolador
            Persona resultado= controller.getPersona();
            
            //Verifico que el resultado no sea null o sea repetido y que la persona en un principio este sin datos
            if (resultado != null) {
                if (personaExistente == null) {
                    if(!this.listaPersonas.contains(resultado)){
                        this.listaPersonas.add(resultado);
                    }else {
                        System.out.println("La persona ya existe");
                    }
                }
            }
            
            this.actualizarListView();
            
        } catch (Exception e) {
            e.printStackTrace(); // Muestra el error en la consola
        }
    }
    
    
}

