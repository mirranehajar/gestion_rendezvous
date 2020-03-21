module org.mirrane {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens org.mirrane to javafx.fxml;
    exports org.mirrane;
}