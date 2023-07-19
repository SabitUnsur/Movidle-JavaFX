package com.example.proje_movidle;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import javax.swing.plaf.OptionPaneUI;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

public class AlertManager {

    public static void SuccessfulAlert(){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);

        ButtonType buttonTypeOK = new ButtonType("OK");

        alert.getButtonTypes().setAll(buttonTypeOK);

        alert.setTitle("Movidle");
        alert.setHeaderText("CONGRATULATIONS!");
        alert.setContentText("You found the movie!  Try  : " + UIController.buttonClickCount + " /5");
        alert.show();
    }

    public static void  InvalidInputAlert(){
        UIController.buttonClickCount--;
        Alert alert = new Alert(Alert.AlertType.ERROR);
        ButtonType buttonTypeCancel = new ButtonType("CANCEL");
        alert.getButtonTypes().setAll(buttonTypeCancel);
        alert.setTitle("Movidle");
        alert.setHeaderText("ERROR");
        alert.setContentText("ERROR" + " " +    "not valid movie. Please Valid movie name from IMDB top 250 list!" + " ");
        alert.showAndWait();
    }

    public  static  void UnSuccessfulAlert(String movie){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        ButtonType buttonTypeOK = new ButtonType("OK");
        alert.getButtonTypes().setAll(buttonTypeOK);
        alert.setTitle("Movidle");
        alert.setHeaderText("YOU LOST!");
        alert.setContentText("The Movie was : " + " " + movie);
        alert.showAndWait();
    }


}
