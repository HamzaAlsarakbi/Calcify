module com.calckify.calckify {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.calckify.calckify to javafx.fxml;
    exports com.calckify.calckify;
}