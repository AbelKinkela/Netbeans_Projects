/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenegraph;

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
public class SceneGraph extends Application {

    @Override
    public void start(Stage primaryStage) {

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));

        Scene scene = new Scene(grid, 300, 275);
        
        Text sceneTitle = new Text("Please Login");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        sceneTitle.setFill(Color.DARKGREEN);
        Label userName = new Label("User Name: ");
        TextField userTextField = new TextField();
        Label pw = new Label("Input your password:");
        PasswordField userPassword = new PasswordField();
        
        
        grid.add(sceneTitle, 0, 0, 2, 1);
        grid.add(userName, 0, 1);
        grid.add(userTextField, 1, 1);
        grid.add(pw, 0, 2);
        grid.add(userPassword, 1, 2);
        
        grid.setGridLinesVisible(false);
        
        Button btn = new Button("Sign in");
        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.BOTTOM_RIGHT);
        hBox.getChildren().add(btn);
        grid.add(hBox,1, 4);
        
        
        
        final Text actionTarget = new Text();
        grid.add(actionTarget, 1, 6);
        
        
        btn.setOnAction(envent-> {
                actionTarget.setFill(Color.FIREBRICK);
                actionTarget.setText("Sign in button pressed!");
        });
        
        
        
        

        primaryStage.setTitle("Login Form");
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
