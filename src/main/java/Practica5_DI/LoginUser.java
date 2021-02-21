package Practica5_DI;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class LoginUser {

    @FXML
    private Button entrarbutton;

    @FXML
    private void switchTotercero() throws IOException {
        App.setRoot("main");
    }
}