module inf.unideb.hu.labyrinth {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires com.google.gson;
    requires json;
    requires com.fasterxml.jackson.databind;

    opens assignment.labyrinth to javafx.fxml;
    exports assignment.labyrinth;
}