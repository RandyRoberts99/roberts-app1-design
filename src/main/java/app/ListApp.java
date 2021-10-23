package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ListApp extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("src/main/resources/app/mainAppBox.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("To Do List Application");
        stage.setScene(scene);
    }
}
