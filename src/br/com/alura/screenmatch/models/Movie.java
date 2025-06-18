package br.com.alura.screenmatch.models;

public class Movie {
    String name;
    int releaseYear;
    boolean planIncluded;
    private double avaliationSum;
    private int totalAvaliations;
    int inMinutesDuration;

    public int getTotalAvaliations(){
        return totalAvaliations;
    }

    public void showMovieInfos() {
        System.out.println("Nome: " + name);
        System.out.println("Ano de Lançamento: " + releaseYear);
    }

    public void madeAvaliation(double avaliation) {
        avaliationSum += avaliation;
        totalAvaliations++;
    }

    public double returnAverage() {
        return avaliationSum / totalAvaliations;
    }
}
