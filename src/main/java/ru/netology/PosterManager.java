package ru.netology;

public class PosterManager {
    private String[] films;
    private int limit;

    public PosterManager(){
        this.limit = 5;
        this.films = new String[0];
    }

    public PosterManager(int limit){
        this.limit = limit;
        this.films = new String[0];
    }

    public void addFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll(){
        return films;
    }

    public String[] findLast(){
        int resultLength;
        if (this.films.length > this.limit) {
            resultLength = this.limit;
        } else {
            resultLength = this.films.length;
        }
  String[] result = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = this.films[this.films.length - 1 -i];
        }
        return result;
    }

}
