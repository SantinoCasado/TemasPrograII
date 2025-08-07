package Controllers;

import Exceptions.DatoErroneoException;
import Exceptions.ProductFarmaVencidoException;
import Validaciones.ValidadorProductosFarmaceuticos;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;
import models.Medicamento;
import models.ProductoFarmaceutico;
import models.Suplemento;


public class FormularioController implements Initializable {
    // Botones
    @FXML private Button btnAceptar;
    @FXML private Button btnCancelar;

    // Campos de entrada
    @FXML private TextField txtNombre;
    @FXML private TextField txtDosis;
    @FXML private DatePicker dpFechaVencimiento;
    @FXML private TextField txtObjetivo;

    // ChoiceBox y CheckBox
    @FXML private ChoiceBox<String> cbTipoProd;
    @FXML private CheckBox cbReceta;

    // Labels
    @FXML private Label lblObjetivo;
    @FXML private Label lblReceta;

    private ProductoFarmaceutico producto;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Ininicalizo los valores predeterminados del choiseBox
        this.cbTipoProd.getItems().addAll("MEDICAMENTO", "SUPLEMENTO");
        //Le doy un valor inicial
        this.cbTipoProd.setValue("MEDICAMENTO");
    }    
    
    @FXML
    void cambiadoTipo(ActionEvent event) {
        //Dependiento del valor del choiseBox seteo un valor al label del datoExtra
        switch(cbTipoProd.getValue()){
            
            case "MEDICAMENTO" -> {
                // Ocultar campos de objetivo
                lblObjetivo.setVisible(false);
                txtObjetivo.setVisible(false);
                lblObjetivo.setManaged(false);
                txtObjetivo.setManaged(false);

                // Mostrar campos de receta
                lblReceta.setVisible(true);
                cbReceta.setVisible(true);
                lblReceta.setManaged(true);
                cbReceta.setManaged(true);

            }
            
            case "SUPLEMENTO" -> {
                // Mostrar campos de objetivo
                lblObjetivo.setVisible(true);
                txtObjetivo.setVisible(true);
                lblObjetivo.setManaged(true);
                txtObjetivo.setManaged(true);

                // Ocultar campos de receta
                lblReceta.setVisible(false);
                cbReceta.setVisible(false);
                lblReceta.setManaged(false);
                cbReceta.setManaged(false);
        }
        }
    }   
    
    //Metodos
    @FXML
    void aceptar(ActionEvent event) {
        //Seteo los valores comunes de los dos
         String tipo = cbTipoProd.getValue();
         String nombre = txtNombre.getText();
         String dosis = txtDosis.getText();
         LocalDate fechaVencimiento = dpFechaVencimiento.getValue();

          try {
            ValidadorProductosFarmaceuticos.validarNombre(nombre);
            ValidadorProductosFarmaceuticos.validarDosis(dosis);
            ValidadorProductosFarmaceuticos.ValidarFechaVencimiento(fechaVencimiento);
            //Si se esta editando
            if (producto != null) {
                // Actualiza atributos comunes
                producto.setNombreComercial(nombre);
                producto.setDosis(dosis);
                producto.setFechaVencimiento(fechaVencimiento);
                
                //seteo y pareceo segun cada caso
                switch (tipo) {
                    case "MEDICAMENTO" -> {
                        boolean requiereReceta = cbReceta.isSelected();
                        ((Medicamento) producto).setRequerimientoRecetaMediica(requiereReceta);
                    }
                    case "SUPLEMENTO" -> {
                        String objetivo = txtObjetivo.getText().trim();
                        ValidadorProductosFarmaceuticos.validarObjetivo(objetivo);
                        ((Suplemento) producto).setObjetivo(objetivo);
                    }
                }
            } else {
                // Crear nuevo objeto según el tipo
                switch (tipo) {
                    case "MEDICAMENTO" -> {
                        boolean requiereReceta = cbReceta.isSelected();
                        this.producto = new Medicamento(requiereReceta, nombre, dosis, fechaVencimiento);
                    }
                    case "SUPLEMENTO" -> {
                        String objetivo = txtObjetivo.getText().trim();
                        this.producto = new Suplemento(objetivo, nombre, dosis, fechaVencimiento);
                    }
                }
            }
            cerrar();
        } catch (DatoErroneoException | ProductFarmaVencidoException e) {
            // Podés mostrar un Alert personalizado si querés
            System.err.println("Error: " + e.getMessage());
        }
    }
    
    
    @FXML
    void cancelar(ActionEvent event) {
        this.cerrar();
    }
    
    public void setProducto(ProductoFarmaceutico producto) {
        this.producto = producto;

        if (producto != null) {
            // Campos comunes
            txtNombre.setText(producto.getNombreComercial());
            txtDosis.setText(producto.getDosis());
            dpFechaVencimiento.setValue(producto.getFechaVencimiento());

            if (producto instanceof Medicamento medicamento) {
                cbTipoProd.setValue("MEDICAMENTO");
                cbReceta.setSelected(medicamento.isRequerimientoRecetaMediica());
            } else if (producto instanceof Suplemento suplemento) {
                cbTipoProd.setValue("SUPLEMENTO");
                txtObjetivo.setText(suplemento.getObjetivo());
            }
        } else {
            // Si es nuevo, limpiar campos
            txtNombre.clear();
            txtDosis.clear();
            dpFechaVencimiento.setValue(null);
            txtObjetivo.clear();
            cbReceta.setSelected(false);
            cbTipoProd.setValue("MEDICAMENTO");
        }

    // Aplicar visibilidad según el tipo seleccionado
    cambiadoTipo(null);
}
    
    public ProductoFarmaceutico getProductoFarmaceutico(){
        return this.producto;
    }
    
    //Metodo que cierra el formulario
    @FXML
     private void cerrar(){
        Stage stage = (Stage)btnCancelar.getScene().getWindow();
        stage.close();
    }
}
