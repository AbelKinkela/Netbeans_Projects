/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Marcelo
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(20);
        grid.setHgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text textscene = new Text("Please Login");
        textscene.setFont(Font.font("Tahoma", FontWeight.BOLD, 20));
        textscene.setFill(Color.WHITE);

        Label userName = new Label("User Name: ");
        TextField nameInput = new TextField();
        Label password = new Label("Password: ");
        PasswordField passwordInput = new PasswordField();

        Button btn = new Button("Sign in");
        Text btnPress = new Text();

        btn.setOnAction(envent -> {
            btnPress.setText(nameInput.getText());

        });

        HBox hBox = new HBox();
        hBox.setAlignment(Pos.BOTTOM_RIGHT);
        hBox.getChildren().add(btn);

        grid.add(textscene, 0, 0);
        grid.add(userName, 0, 1);
        grid.add(nameInput, 1, 1);
        grid.add(password, 0, 2);
        grid.add(passwordInput, 1, 2);
        grid.add(hBox, 1, 4);
        grid.add(btnPress, 1, 5);

        grid.setGridLinesVisible(false);
        Scene scene = new Scene(grid, 400, 250);

        scene.getStylesheets().add(
                Main.class.getResource("styles.css").toExternalForm());

//String css = Main.class.getResource("styles.css").toExternalForm();
//scene.getStylesheets().clear();
//scene.getStylesheets().add(css);

        primaryStage.setTitle("Login here");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
