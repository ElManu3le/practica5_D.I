package Practica5_DI;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class TercerControlador {

    @FXML
    private Button exit;
    @FXML
    private Button accept;

    @FXML
    private Button reset;

    @FXML
    private void switchTotercero() throws IOException {
        App.setRoot("Login");
    }

}
