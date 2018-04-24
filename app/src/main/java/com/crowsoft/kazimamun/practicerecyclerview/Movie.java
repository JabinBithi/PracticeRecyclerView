package com.crowsoft.kazimamun.practicerecyclerview;

/**
 * Created by kazia on 29-May-16.
 */
public class Movie {

    private String movieName, movieGener, movieYear;

    public Movie(String movieName, String movieGener, String movieYear) {
        this.movieName = movieName;
        this.movieGener = movieGener;
        this.movieYear = movieYear;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieGener() {
        return movieGener;
    }

    public void setMovieGener(String movieGener) {
        this.movieGener = movieGener;
    }

    public String getMovieYear() {
        return movieYear;
    }

    public void setMovieYear(String movieYear) {
        this.movieYear = movieYear;
    }
}
