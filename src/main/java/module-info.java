module Practica5_DI {
    requires javafx.controls;
    requires javafx.fxml;

    opens Practica5_DI to javafx.fxml;
    exports Practica5_DI;
}