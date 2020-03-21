package org.mirrane;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SecondaryController {

    @FXML
    private TextField textField1;

    @FXML
    private Label label1;

    @FXML
    private void switchToPrimary() throws IOException {
        label1.setText(textField1.getText());
/*
        App.setRoot("primary");
*/

    }
}