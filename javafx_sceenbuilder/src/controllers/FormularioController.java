package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import models.Persona;


public class FormularioController implements Initializable {
    //Asocio los atributos de la view
    
    //Botones
   @FXML
    private Button btnConfirmar;
    @FXML
    private Button btnCancelar;
    
    //txt
    @FXML
    private TextField txtId;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellido;    
    
    private Persona persona;
    private boolean confirmado;
    
    //Los OnAction de los botones confirmar y cancelar
    @FXML
    private void confirmar(){
        //Obtengo los valores que se asignaron previamente en setPersona y elimino espacios
        String id = this.txtId.getText().trim();
        String nombre = this.txtNombre.getText().trim();
        String apellido = this.txtApellido.getText().trim();
        
        //Corroboro que no se alla pasado datos vacios
        if(id.isEmpty() || nombre.isEmpty() || apellido.isEmpty()){
            System.out.println("Campos obligatorios");
            return;
        }
        
        //Parseo el id
        int idInd = Integer.parseInt(id);
        
        //Verifico que la persona actual sea null para poder agregarla
        if(this.persona == null){
            this.persona = new Persona(nombre, idInd, apellido); 
        }else{
            //La persona ya existe, por lo cual le voy a setear los nuevos valores
            this.persona.setId(idInd);
            this.persona.setApellido(apellido);
            this.persona.setNombre(nombre);
        }
        this.confirmado = true;
        this.cerrarVentana();
    }
    
    @FXML
    private void cancelar(){
        //Cuando se clikee el boton cancelar se cerrara la ventana
        this.cerrarVentana();
    }
    
    private void cerrarVentana(){
        //se método obtiene la ventana actual (el Stage) desde el botón btnCancelar y luego la cierra
        Stage stage = (Stage) btnCancelar.getScene().getWindow();
         stage.close();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public Persona getPersona(){
        return this.confirmado? this.persona : null;            //Si confirmado es true, el método devuelve el objeto persona. Si confirmado es false, el método devuelve null.
    }
    
    public void setPersona(Persona persona){
        this.persona = persona;
        
        if (persona != null) {
            //Seteo los valores a los txt de los valores pasados del objeto
            this.txtId.setText(String.valueOf(persona.getId()));
            this.txtNombre.setText(persona.getNombre());
            this.txtApellido.setText(persona.getApellido());
            
        }else {
        }
    }
}
