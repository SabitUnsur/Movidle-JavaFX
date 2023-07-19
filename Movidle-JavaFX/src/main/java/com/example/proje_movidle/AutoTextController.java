package com.example.proje_movidle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class AutoTextController {

    //Film listesini alır.
    public  static ObservableList<String> getMovieValues(){
          final ObservableList<String> movieTitleValues = FXCollections.observableArrayList(
                DataSetController.getMovieTitles());
        return movieTitleValues;
    }

    /* Textfielda bir harf girildiğinde, bunu küçük harfli hale çevirip input değişkenine atar.
     input boş değilse ilgili kelimeler adında bir ObservableList tanımlanır. Sonrasında for döngüsü ile
    eğer ki film listesi içerisinde bizim aldığımız input değişkeni ile başlayan bir veya birden fazla veri varsa bu listeye atar.
    sonrasında ListView'a bu verileri yükleriz.*/
    public static  void SetMovies(ListView listView, TextField textField){
        listView.setItems(getMovieValues());
        textField.setOnKeyReleased(keyEvent -> {
            String input = textField.getText().toLowerCase();
            if(!input.isEmpty()){
                ObservableList<String> relatedWord = FXCollections.observableArrayList();

                for(String word : getMovieValues()){
                    if(word.toLowerCase().startsWith(input)){
                        relatedWord.add(word);
                    }
                }
                listView.setItems(relatedWord);
            }
            else {
                listView.setItems(getMovieValues());
            }
        });

        listView.setItems(getMovieValues());
        textField.setOnKeyReleased(keyEvent -> {
            String input = textField.getText().toLowerCase();
            if(!input.isEmpty()){
                ObservableList<String> filteredWords = FXCollections.observableArrayList();

                for(String word : getMovieValues()){
                    if(word.toLowerCase().startsWith(input)){
                        filteredWords.add(word);
                    }
                }
                listView.setItems(filteredWords);
            }
            else {
                listView.setItems(getMovieValues());
            }
        });
    }

    // listview üzerinden mouse ile seçilen film adını TextFielda getirir.
    public  static  void SetOnMouseClicked(ListView listView,TextField textField){
        listView.setOnMouseClicked(mouseEvent -> {
            String selectedItem = (String) listView.getSelectionModel().getSelectedItem();
            if(selectedItem != null){
                textField.setText(selectedItem);
            }
        });
    }

    // List view üzerinde klavye yön tuşları ile gezmeyi sağlar. Bunu yapabilmek için listViewda bir değere mouse ile tıklamak gerekmektedir.
    //Mouse ile listview üzerinde kaydırma işlemi yapabilmeyi sağlar.
    public static void KeyEventHandler(ListView listView ,KeyEvent event){
        listView.addEventHandler(KeyEvent.KEY_PRESSED, keyEvent -> {
            if(event.getCode() == KeyCode.UP){
                int Index =  listView.getSelectionModel().getSelectedIndex();
                if(Index > 0 ){
                    listView.getSelectionModel().select(Index-1);
                    listView.scrollTo(Index-1);
                }
                event.consume();
            } else if (event.getCode() == KeyCode.DOWN) {
                int Index =  listView.getSelectionModel().getSelectedIndex();
                if(Index < getMovieValues().size() -1 ){
                    listView.getSelectionModel().select(Index + 1);
                    listView.scrollTo(Index + 1 );
                }
                event.consume();
            }
        });
    }
}
