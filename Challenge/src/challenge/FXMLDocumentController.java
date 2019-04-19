/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import java.util.Random;

/**
 *
 * @author Marcelo
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;

    String[] responses = {"Angola", "ALC", "Makanzu"};

    public static int getRandomNumber() {
        Random x = new Random();
        int r = x.nextInt(2)+1;
        return r;
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println(responses[getRandomNumber()]);
        label.setText(responses[getRandomNumber()]);

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
