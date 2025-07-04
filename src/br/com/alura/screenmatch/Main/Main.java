package br.com.alura.screenmatch.Main;

import br.com.alura.screenmatch.calcules.TimeCalculator;
import br.com.alura.screenmatch.models.Episode;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;
import br.com.alura.screenmatch.models.RecommendationFilter;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Django: Unchained", 2013);
        myMovie.setInMinutesDuration(160);

        myMovie.showMovieInfos();
        myMovie.madeAvaliation(5);
        myMovie.madeAvaliation(10);
        System.out.println(myMovie.getTotalAvaliations());
        System.out.println(myMovie.returnAverage());

        Movie anotherMovie = new Movie("O paizão",1999);
        anotherMovie.setInMinutesDuration(200);

        Series mySerie = new Series("The day of jackal", 2023);

        mySerie.setSeasons(3);
        mySerie.setEpisodesPerSeason(10);
        mySerie.setMinutesPerEpisode(50);
        System.out.println("Duração total da serie: " + mySerie.getInMinutesDuration());

        TimeCalculator calc = new TimeCalculator();
        calc.includes(myMovie);
        calc.includes(anotherMovie);
        System.out.println("Tempo total da calc: " + calc.getTotalTime());

        RecommendationFilter myFilter = new RecommendationFilter();
        myFilter.filter(myMovie);

        Episode myEp = new Episode();
        myEp.setNumber(1);
        myEp.setName("piloto");
        myEp.setSeries(mySerie);
        myEp.setTotalViews(300);
        myFilter.filter(myEp);

        var thirdMovie = new Movie("Bastardos Inglorios", 2009);
        thirdMovie.madeAvaliation(9);
        thirdMovie.setInMinutesDuration(180);

        ArrayList<Movie> moviesList = new ArrayList<>();
        moviesList.add(myMovie);
        moviesList.add(anotherMovie);
        moviesList.add(thirdMovie);

        System.out.println("Tamanho da lista: " + moviesList.size());
        System.out.println("Primeiro filme: " + moviesList.get(0).getName());
        System.out.println(moviesList);


    }
}