package com.example.proje_movidle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class UIApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(UIApplication.class.getResource("movidle-UI.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 900,600);
        stage.setTitle("Movidle");
        Image img=new Image("https://cdn4.iconfinder.com/data/icons/audio-and-video/512/movie_clapboard_cinema_clapper_studio_equipment_flat_icon_symbol-1024.png");
        stage.getIcons().add(img);
        stage.setFullScreen(false);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
