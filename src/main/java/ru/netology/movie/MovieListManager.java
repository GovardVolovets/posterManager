package ru.netology.movie;

public class MovieListManager {
    private String[] moviesList = new String[0];
    private int limit;

    public MovieListManager() {
        this.limit = 5;
    }
    public MovieListManager(int limit) {
        this.limit = limit;
    }

    public void addMovie(String movie) {
        if (moviesList.length < limit) {
            String[] newList = new String[moviesList.length + 1];
            for (int i = 0; i < moviesList.length; i++) {
                newList[i] = moviesList[i];
            }
            newList[newList.length - 1] = movie;
            moviesList = newList;
        } else {
            for (int i = 0; i < moviesList.length - 1; i++) {
                moviesList[i] = moviesList[i + 1];
            }
            moviesList[moviesList.length - 1] = movie;
        }
    }

    public String[] findAll() {
        return moviesList;
    }
    public String[] findLast() {
        int resultLength;
        if (moviesList.length < limit) {
            resultLength = moviesList.length;
        } else {
            resultLength = limit;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = moviesList[moviesList.length - 1 - i];
        }
        return result;
    }
}
