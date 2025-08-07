package Controllers;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import models.ProductoFarmaceutico;

public class FiltradoController implements Initializable {
    @FXML
    private ListView<ProductoFarmaceutico> listViewFiltrados;

    public void setProductosFiltrados(List<ProductoFarmaceutico> productos) {
        listViewFiltrados.getItems().setAll(productos);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
}
