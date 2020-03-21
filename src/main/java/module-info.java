module org.mirrane {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.mirrane to javafx.fxml;
    exports org.mirrane;
}