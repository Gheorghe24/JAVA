module com.example.gui8 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.gui8 to javafx.fxml;
    exports com.example.gui8;
}