module kozmikoda.soundanalyzer {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.jfoenix;

    opens kozmikoda.soundanalyzer to javafx.fxml;
    exports kozmikoda.soundanalyzer;
}