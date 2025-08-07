package Estacionamiento;

import controllers.ViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class main extends Application {
    @Override
    public void start(Stage stage) throws Exception { 
        //Entry Point de mi aplicación
        //Cargo la vista de fxml
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Views/view.fxml"));
        
        //Creo la escena
        Scene scene = new Scene(loader.load()); //Utilizo el metodo que viene con FXMLLoader
        ViewController controladorVista = loader.getController();
        
        //Seteo la escena en el stage
        stage.setScene(scene);
        
        //Este método registra un evento que se dispara cuando el usuario intenta cerrar la ventana principal (stage). En este caso, le pasás una expresión lambda:
        stage.setOnCloseRequest(e -> controladorVista.GuardarArchivo());        
        stage.show();
        
    }
    
    public static void main(String[] args) {
        Application.launch();
    }
}
