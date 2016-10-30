/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texttest;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Kelvin Wong
 */
public class TextTest extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Text testText = new Text();
        testText.setText("Tester testing the test");
        testText.setFont(Font.font("Comic Sans MS",20));
        testText.setFill(Color.GREEN);
        testText.setTranslateY(50);
        
        Pane test = new Pane();
        test.getChildren().add(testText);
        BorderPane root = new BorderPane();
        root.setCenter(test);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
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
