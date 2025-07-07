package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.Main.OmdbTitle;
import br.com.alura.screenmatch.exceptions.ConvertYearException;
import com.google.gson.annotations.SerializedName;

import static java.lang.Integer.parseInt;

public class Title implements Comparable<Title> {

    @SerializedName("Title")
    private String name;

    @SerializedName("Year")
    private int releaseYear;

    private int inMinutesDuration;

    private boolean planIncluded;
    private double avaliationSum;
    private int totalAvaliations;



    public Title(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public Title(OmdbTitle myOmdbTitle) {
        this.name = myOmdbTitle.title();

        if (myOmdbTitle.year().length() > 4){
            throw new ConvertYearException("Não foi possível converter o ano " + myOmdbTitle.year() + ", Pois ele possui mais de 04 caracteres...");
        }

        this.releaseYear =  Integer.parseInt(myOmdbTitle.year());
        this.inMinutesDuration = Integer.parseInt(myOmdbTitle.runtime().replace("min", "").strip());
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

    @Override
    public String toString() {
        return "Nome: " + name + " (" + releaseYear + ")" + " - " + inMinutesDuration + " min";
    }
}
