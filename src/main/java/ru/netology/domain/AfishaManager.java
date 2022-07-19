package ru.netology.domain;

public class AfishaManager {
    private int limitMovies = 10;
    private Cinema[] moviesList = new Cinema[0];

    public AfishaManager() {
    }

    public AfishaManager(int limitMovies) {
        this.limitMovies = limitMovies;
    }

    public Cinema[] getMoviesList() {
        return moviesList;
    }

    public void setMoviesList(Cinema[] moviesList) {
        this.moviesList = moviesList;
    }

    public int getLimitMovies() {
        return limitMovies;
    }

    public void setLimitMovies(int limitMovies) {
        this.limitMovies = limitMovies;
    }

    public void addMovie(Cinema movieAdd) {
        int lenght = moviesList.length + 1;
        Cinema[] tmp = new Cinema[lenght];
        System.arraycopy(moviesList, 0, tmp, 0, moviesList.length);
        int addFilm = tmp.length - 1;
        tmp[addFilm] = movieAdd;
        moviesList = tmp;
    }

    public Cinema[] findLast() {
        int resultLenght;
        if (moviesList.length <= limitMovies) {
            resultLenght = moviesList.length;
        } else {
            resultLenght = limitMovies;
        }
        Cinema[] result = new Cinema[resultLenght];
        for (int i = 0; i < resultLenght; i++) {
            int index = moviesList.length - i - 1;
            result[i] = moviesList[index];
        }
        return result;
    }

    public Cinema[] findAll() {
        Cinema[] result = new Cinema[moviesList.length];
        System.arraycopy(moviesList, 0, result, 0, result.length);
        return result;
    }
}
