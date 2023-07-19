package com.example.proje_movidle;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

import java.util.List;
import java.util.Random;

public class ButtonManager {
    public static  int GetRandom(){
        Random random = new Random();
        int randomNumber = random.nextInt(251);
        return randomNumber;
    }

    static Movie generatedMovie= DataSetController.moviesList.get(GetRandom());


    public  static  boolean IsWon(Movie movie, Button button,Button btnguess,Button btnRetry)
    {

        if(IsMatchMovieTitle(movie,button) && UIController.buttonClickCount<=5){
            btnguess.setDisable(true);
            btnRetry.setDisable(false);
            AlertManager.SuccessfulAlert();
            return true;}

        if (IsMatchMovieTitle(movie, button) ==false && UIController.buttonClickCount == 5) {
            btnRetry.setDisable(false);
            PrintRealMovie();
        }
        return false;
    }

    public  static  void PrintRealMovie()
    {
        AlertManager.UnSuccessfulAlert(generatedMovie.getMovieTitle());
    }

    public static boolean IsMatchMovieTitle(Movie movie, Button button)
    {
        button.setVisible(true);
        button.setText(movie.getMovieTitle());
            if (movie.getMovieTitle().matches(generatedMovie.getMovieTitle())) {
                button.setStyle("-fx-background-color: green;");
                return true;}
              else {
                button.setStyle("-fx-background-color: red;");
                return false;
            }
    }
    public static  boolean IsMatchMovieYear(Movie movie, Button button)
    {
        button.setVisible(true);
        button.setText(movie.getMovieYear());
        if(movie.getMovieYear().matches(generatedMovie.getMovieYear())){
            button.setStyle("-fx-background-color: green;");
            return true;}
        else{
            button.setStyle("-fx-background-color: red;");
            if(Integer.parseInt(movie.getMovieYear()) < Integer.parseInt(generatedMovie.getMovieYear())){
                ImageView imageView = new ImageView(new Image("https://cdn2.iconfinder.com/data/icons/outline-ui-v2/24/arrowup-256.png"));
                imageView.setFitWidth(40);
                imageView.setFitHeight(40);
                button.setGraphic(imageView);}

            else {
                ImageView imageView = new ImageView(new Image("https://cdn1.iconfinder.com/data/icons/essentials-pack/96/down_bottom_downward_arrow_navigation-1024.png"));
                imageView.setFitWidth(30);
                imageView.setFitHeight(30);
                button.setGraphic(imageView);}

            return false;
        }
    }

    public static  boolean IsMatchMovieGenre(Movie movie, Button button)
    {
        button.setVisible(true);
        button.setText(movie.getGenre());
        if(movie.getGenre().matches(generatedMovie.getGenre())){
            button.setStyle("-fx-background-color: green;");
            return true;}
        else{
            button.setStyle("-fx-background-color: red;");
            return false;
        }
    }

    public static  boolean IsMatchMovieOrigin(Movie movie, Button button)
    {
        button.setVisible(true);
        button.setText(movie.getOrigin());
        if(movie.getOrigin().matches(generatedMovie.getOrigin())){
            button.setStyle("-fx-background-color: green;");
            return true;}
        else{
            button.setStyle("-fx-background-color: red;");
            return false;
        }
    }

    public static boolean IsMatchMovieDirector(Movie movie, Button button)
    {
        button.setVisible(true);
        button.setText(movie.getDirector());
        if(movie.getDirector().matches(generatedMovie.getDirector())){
            button.setStyle("-fx-background-color: green;");
            return true;}
        else{
            button.setStyle("-fx-background-color: red;");
            return false;
        }
    }

    public static boolean IsMatchMovieStar(Movie movie, Button button)
    {
        button.setVisible(true);
        button.setText(movie.getStar());
        if(movie.getStar().matches(generatedMovie.getStar())){
            button.setStyle("-fx-background-color: green;");
            return true;}
        else{
            button.setStyle("-fx-background-color: red;");
            return false;
        }
    }

    public static void buttonReset(Button button){
        button.setVisible(false);
        button.setText(null);
    }


}
