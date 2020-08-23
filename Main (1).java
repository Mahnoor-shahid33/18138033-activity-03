
package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;




public class Main extends Application {
    Label username;
    Label password;
    private TextField Username;
    private TextField Password;
    VBox plane1;
    VBox plane2;
    private FlowPane Box;

    private Button Signin;


    @Override
    public void start(Stage primaryStage) throws Exception {
        username = new Label("Username");
        password = new Label("Password");
        Username = new TextField();
        Password = new TextField();
        Signin = new Button("Sign in");
        plane1 = new VBox(40);
        plane2 = new VBox(20);
        plane1.getChildren().addAll(username, password);
        plane2.getChildren().addAll(Username, Password);
        plane1.setPadding(new Insets(100, 10, 200, 400));
        plane2.setPadding(new Insets(100, 20, 200, 200));

        Box = new FlowPane(plane1, plane2);
        Scene Screen = new Scene(Box, 1000, 500);
        primaryStage.setTitle("18138033");
        primaryStage.setScene(Screen);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }



}