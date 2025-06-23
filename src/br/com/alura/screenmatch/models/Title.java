package br.com.alura.screenmatch.models;

public class Title {
    private String name;
    private int releaseYear;
    private boolean planIncluded;
    private double avaliationSum;
    private int totalAvaliations;
    private int inMinutesDuration;


    //    GETTERS
    public int getTotalAvaliations(){
        return totalAvaliations;
    }

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isPlanIncluded() {
        return planIncluded;
    }

    public int getInMinutesDuration() {
        return inMinutesDuration;
    }

    //    SETTER
    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int year) {
        this.releaseYear = year;
    }

    public void setInMinutesDuration(int mins) {
        this.inMinutesDuration = mins;
    }

    public void setPlanIncluded(boolean included) {
        this.planIncluded = included;
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
