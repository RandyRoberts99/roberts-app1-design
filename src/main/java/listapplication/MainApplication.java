/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 Randall Roberts
 */

package listapplication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application
{
    @Override
    public void start(Stage stage) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("MainBox.fxml"));
        Scene scene = new Scene(root);
        stage.setResizable(false);
        stage.setTitle("To Do List Application");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}
