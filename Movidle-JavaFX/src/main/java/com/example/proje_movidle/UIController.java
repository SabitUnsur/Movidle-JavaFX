package com.example.proje_movidle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.image.ImageView;
import java.util.Optional;

public class UIController {

    @FXML
    private Button btn00;
    @FXML
    private Button btn01;
    @FXML
    private Button btn02;
    @FXML
    private Button btn03;
    @FXML
    private Button btn04;
    @FXML
    private Button btn05;
    @FXML
    private Button btn10;
    @FXML
    private Button btn11;
    @FXML
    private Button btn12;
    @FXML
    private Button btn13;
    @FXML
    private Button btn14;
    @FXML
    private Button btn15;
    @FXML
    private Button btn20;
    @FXML
    private Button btn21;
    @FXML
    private Button btn22;
    @FXML
    private Button btn23;
    @FXML
    private Button btn24;
    @FXML
    private Button btn25;
    @FXML
    private Button btn30;
    @FXML
    private Button btn31;
    @FXML
    private Button btn32;
    @FXML
    private Button btn33;
    @FXML
    private Button btn34;
    @FXML
    private Button btn35;
    @FXML
    private Button btn40;
    @FXML
    private Button btn41;
    @FXML
    private Button btn42;
    @FXML
    private Button btn43;
    @FXML
    private Button btn44;
    @FXML
    private Button btn45;
    @FXML
    private Button btnGuess;
    @FXML
    private Button btnRetry;
    @FXML
    private ImageView imageView;
    @FXML
    private Label lbl;
    @FXML
    private TextField textField;
    @FXML
    private ListView listView;
    @FXML
    public HBox hBox1;
    @FXML
    public HBox hBox2;
    @FXML
    private HBox hBox3;
    @FXML
    private HBox hBox4;
    @FXML
    private HBox hBox5;
    @FXML
    private Label label;
    public static int buttonClickCount = 1;
    @FXML
    void view(ActionEvent event) {

        // System.out.println(ButtonManager.generatedMovie.movieTitle); Üretilen filmi görme testi

        if (!textField.getText().isEmpty() && event.getSource() == btnGuess) {
                  var guessedMovie = DataSetController.getMovieList().stream().
                          filter(movie -> movie.movieTitle.equalsIgnoreCase(textField.getText())).findAny();

                  //Film dosyası içinde textfielda girdiğimiz film adını filtreleme yaparak döndürür.

                //Aradığımız film mevcutsa yapılan işlemler.

                  if (guessedMovie.isPresent()) {

                      Movie result = guessedMovie.get();

                      if (buttonClickCount == 1 ) {
                          AnimationManager.SetAnimations(btn00,btn01,btn02,btn03,btn04,btn05);
                          hBox1.setStyle("-fx-border-color: Black;");;
                          ButtonManager.IsMatchMovieTitle(result, btn00);
                          ButtonManager.IsMatchMovieYear(result, btn01);
                          ButtonManager.IsMatchMovieGenre(result, btn02);
                          ButtonManager.IsMatchMovieOrigin(result, btn03);
                          ButtonManager.IsMatchMovieDirector(result, btn04);
                          ButtonManager.IsMatchMovieStar(result, btn05);
                          ButtonManager.IsWon(result, btn00,btnGuess,btnRetry);
                          ImageManager.GetImageByMovieID(imageView,result);
                          label.setText("Remaining" + " : " + " " + (5-buttonClickCount ));
                      }

                      if (buttonClickCount == 2 ) {
                          AnimationManager.SetAnimations(btn10,btn11,btn12,btn13,btn14,btn15);
                          hBox1.setStyle("-fx-border-color: White;");
                          hBox2.setStyle("-fx-border-color: Black;");
                          ButtonManager.IsMatchMovieTitle(result, btn10);
                          ButtonManager.IsMatchMovieYear(result, btn11);
                          ButtonManager.IsMatchMovieGenre(result, btn12);
                          ButtonManager.IsMatchMovieOrigin(result, btn13);
                          ButtonManager.IsMatchMovieDirector(result, btn14);
                          ButtonManager.IsMatchMovieStar(result, btn15);
                          ButtonManager.IsWon(result, btn10,btnGuess,btnRetry);
                          ImageManager.GetImageByMovieID(imageView,result);
                          label.setText("Remaining" + " : " + " " + (5-buttonClickCount ));}

                      if (buttonClickCount == 3) {
                          AnimationManager.SetAnimations(btn20,btn21,btn22,btn23,btn24,btn25);
                          hBox2.setStyle("-fx-border-color: White;");
                          hBox3.setStyle("-fx-border-color: Black;");
                          ButtonManager.IsMatchMovieTitle(result, btn20);
                          ButtonManager.IsMatchMovieYear(result, btn21);
                          ButtonManager.IsMatchMovieGenre(result, btn22);
                          ButtonManager.IsMatchMovieOrigin(result, btn23);
                          ButtonManager.IsMatchMovieDirector(result, btn24);
                          ButtonManager.IsMatchMovieStar(result, btn25);
                          ButtonManager.IsWon(result,btn20,btnGuess,btnRetry);
                          ImageManager.GetImageByMovieID(imageView,result);
                          label.setText("Remaining" + " : " + " " + (5-buttonClickCount ));}

                      if (buttonClickCount == 4 ) {
                          AnimationManager.SetAnimations(btn30,btn31,btn32,btn33,btn34,btn35);
                          hBox3.setStyle("-fx-border-color: White;");
                          hBox4.setStyle("-fx-border-color: Black;");
                          ButtonManager.IsMatchMovieTitle(result, btn30);
                          ButtonManager.IsMatchMovieYear(result, btn31);
                          ButtonManager.IsMatchMovieGenre(result, btn32);
                          ButtonManager.IsMatchMovieOrigin(result, btn33);
                          ButtonManager.IsMatchMovieDirector(result, btn34);
                          ButtonManager.IsMatchMovieStar(result, btn35);
                          ButtonManager.IsWon(result,btn30,btnGuess,btnRetry);
                          ImageManager.GetImageByMovieID(imageView,result);
                          label.setText("Remaining" + " : " + " " + (5-buttonClickCount ));}

                      if (buttonClickCount == 5 ) {
                          AnimationManager.SetAnimations(btn40,btn41,btn42,btn43,btn44,btn45);
                          hBox4.setStyle("-fx-border-color: White;");
                          hBox5.setStyle("-fx-border-color: Black;");
                          ButtonManager.IsMatchMovieTitle(result, btn40);
                          ButtonManager.IsMatchMovieYear(result, btn41);
                          ButtonManager.IsMatchMovieGenre(result, btn42);
                          ButtonManager.IsMatchMovieOrigin(result, btn43);
                          ButtonManager.IsMatchMovieDirector(result, btn44);
                          ButtonManager.IsMatchMovieStar(result, btn45);
                          ButtonManager.IsWon(result, btn40,btnGuess,btnRetry);
                          ImageManager.GetImageByMovieID(imageView,result);
                          label.setText("Remaining" + " : " + " " + (5-buttonClickCount ));}}
                  else{

                      AlertManager.InvalidInputAlert();
                  }

                  buttonClickCount++;
        }

    }

    @FXML
    void retryGame(ActionEvent event){
        imageView.setImage(null);
        label.setText("Remaining" + " : " + " " + (5));
        ButtonManager.generatedMovie=null;
        ButtonManager.generatedMovie= DataSetController.moviesList.get(ButtonManager.GetRandom());
        btnGuess.setDisable(false);
        btnRetry.setDisable(true);

        ButtonManager.buttonReset(btn00);
        ButtonManager.buttonReset(btn01);
        ButtonManager.buttonReset(btn02);
        ButtonManager.buttonReset(btn03);
        ButtonManager.buttonReset(btn04);
        ButtonManager.buttonReset(btn05);
        ButtonManager.buttonReset(btn10);
        ButtonManager.buttonReset(btn11);
        ButtonManager.buttonReset(btn12);
        ButtonManager.buttonReset(btn13);
        ButtonManager.buttonReset(btn14);
        ButtonManager.buttonReset(btn15);
        ButtonManager.buttonReset(btn20);
        ButtonManager.buttonReset(btn21);
        ButtonManager.buttonReset(btn22);
        ButtonManager.buttonReset(btn23);
        ButtonManager.buttonReset(btn24);
        ButtonManager.buttonReset(btn25);
        ButtonManager.buttonReset(btn30);
        ButtonManager.buttonReset(btn31);
        ButtonManager.buttonReset(btn32);
        ButtonManager.buttonReset(btn33);
        ButtonManager.buttonReset(btn34);
        ButtonManager.buttonReset(btn35);
        ButtonManager.buttonReset(btn40);
        ButtonManager.buttonReset(btn41);
        ButtonManager.buttonReset(btn42);
        ButtonManager.buttonReset(btn43);
        ButtonManager.buttonReset(btn44);
        ButtonManager.buttonReset(btn45);
        buttonClickCount=1;

        hBox1.setStyle("");
        hBox2.setStyle("");
        hBox3.setStyle("");
        hBox4.setStyle("");
        hBox5.setStyle("");
    }
    @FXML
    public void handleKeyPressed(KeyEvent event){
        listView.setVisible(true);
        AutoTextController.SetMovies(listView,textField);
        AutoTextController.SetOnMouseClicked(listView,textField);
        AutoTextController.KeyEventHandler(listView,event);
    }
}







