package com.example.proje_movidle;

public class Movie {
    String movieID;
    String movieTitle;
    String movieYear;
    String Genre;
    String Origin;
    String Director;
    String Star;

    public Movie(String movieID,String movieTitle,String movieYear,String Genre,String Origin,String Director, String Star) {
        this.movieID=movieID;
        this.movieTitle=movieTitle;
        this.movieYear=movieYear;
        this.Genre=Genre;
        this.Origin=Origin;
        this.Director=Director;
        this.Star=Star;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "ID='" + movieID +
                ", title='" + movieTitle +
                ", director='" + Director +
                ", genre='" + Genre +
                ", releaseDate='" + movieYear +
                ", star='" + Star +
                '}';
    }

    public String getMovieID() {
        return movieID;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMovieYear() {
        return movieYear;
    }

    public String getGenre() {
        return Genre;
    }

    public String getOrigin() {
        return Origin;
    }

    public String getDirector() {
        return Director;
    }

    public String getStar() {
        return Star;
    }

}
