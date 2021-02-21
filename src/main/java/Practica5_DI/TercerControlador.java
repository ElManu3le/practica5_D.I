package Practica5_DI;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class TercerControlador {
    
    @FXML
    private Button boton1;
    @FXML
    private void switchTotercero() throws IOException {
        App.setRoot("tercer");
    }

    
    
}
