package Practica5_DI;

import java.io.IOException;
import javafx.fxml.FXML;

public class LoginUser {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("LoginUser");
    }
}