module Sample {
    requires javafx.fxml;
    requires org.apache.pdfbox;
    requires java.desktop;
    requires javafx.graphics;
    requires javafx.controls;
    opens sample to javafx.fxml;
    opens Controllers to javafx.fxml;

    exports sample;
    exports Controllers;
}