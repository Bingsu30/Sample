package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            URL fxml = getClass().getResource("/fxml/tabPane.fxml");
            if (fxml == null) {
                throw new IOException("FXML file not found");
            }
            FXMLLoader fxmlLoader = new FXMLLoader(fxml);
            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root);
            primaryStage.initStyle(StageStyle.DECORATED);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}