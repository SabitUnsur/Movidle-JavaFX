package com.example.proje_movidle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
public class DataSetController {
    public static List<Movie> moviesList;
    public static String getMoviePath(){
        String csvFileSource="src\\main\\java\\imdb_top_250.csv";
        return csvFileSource;
    }

    public static List<ImageEntity> imageList;
    public static String getImagePath(){
        String csvImageSource = "src\\main\\java\\imdb_top_250_images.csv";
        return csvImageSource;
    }

    public static List<ImageEntity> getImageList(){
        imageList = new ArrayList<>();
        String csvSplitter = ";";

        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(getImagePath()));
            String line;
            while((line= bufferedReader.readLine())!= null){
                String[] values = line.split(csvSplitter);
                imageList.add(new ImageEntity(
                        values[0], //ImageID
                        values[1]  //ImageLink
                ));
            }
        } catch (Exception e){
            e.printStackTrace();}
        return imageList;
    }

    public static List<Movie> getMovieList(){
        moviesList = new ArrayList<>();
        String csvSplitter = ";";
        try{
            BufferedReader reader=new BufferedReader(new FileReader(getMoviePath(), StandardCharsets.ISO_8859_1));
            String line=reader.readLine();
            while ((line=reader.readLine()) != null){
                String[] movieDatas = line.split(csvSplitter);
                moviesList.add(new Movie(
                        movieDatas[0], //movieID
                        movieDatas[1], //MovieTitle
                        movieDatas[2],
                        movieDatas[3],
                        movieDatas[4],
                        movieDatas[5],
                        movieDatas[6]));} }
        catch(Exception exception){
            exception.printStackTrace(); }

        return moviesList;
    }

    public static List<String> getMovieTitles() {
        List<String> movieTitles = new ArrayList<>();
            for (Movie movie : DataSetController.getMovieList()) {
                String movieTitle = movie.getMovieTitle();
                movieTitles.add(movieTitle);
            }
        return movieTitles;
    }
}
