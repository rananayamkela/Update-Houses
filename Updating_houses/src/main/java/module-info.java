module com.example.updating_houses {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.updating_houses to javafx.fxml;
    exports com.example.updating_houses;
}