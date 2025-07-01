package br.com.alura.screenmatch.models;

public class Title implements Comparable<Title> {
    private String name;
    private int releaseYear;
    private boolean planIncluded;
    private double avaliationSum;
    private int totalAvaliations;
    private int inMinutesDuration;

    public Title(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

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
        releaseYear = year;
    }

    public void setInMinutesDuration(int mins) {
        inMinutesDuration = mins;
    }

    public void setPlanIncluded(boolean included) {
        planIncluded = included;
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

    @Override
    public int compareTo(Title title) {
        return this.getName().compareTo(title.getName());
    }
}
