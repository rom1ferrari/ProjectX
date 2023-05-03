module com.example.projectx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projectx to javafx.fxml;
    exports com.example.projectx;
}