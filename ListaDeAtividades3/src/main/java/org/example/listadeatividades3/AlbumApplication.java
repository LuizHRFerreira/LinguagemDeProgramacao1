package org.example.listadeatividades3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AlbumApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AlbumApplication.class.getResource("Album-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 502, 442);
        stage.setTitle("Album");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
