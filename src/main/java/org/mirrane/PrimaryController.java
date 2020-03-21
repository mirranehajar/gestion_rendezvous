package org.mirrane;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import org.mirrane.model.Secretary;
import org.mirrane.service.SecretaryService;

public class PrimaryController {

    SecretaryService secretaryService = new SecretaryService();

    @FXML
    private TableView tableView1;

    @FXML
    private Label label1;

    @FXML
    private void switchToSecondary() throws IOException {

        List<Secretary> secretaries = secretaryService.getSecretaryList();

        String text = secretaries.get(0).getCin() + " " + secretaries.get(0).getFirstName();


        label1.setText(text);

        //App.setRoot("secondary");
    }
}
