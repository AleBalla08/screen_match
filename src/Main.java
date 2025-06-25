import br.com.alura.screenmatch.calcules.TimeCalculator;
import br.com.alura.screenmatch.models.Episode;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;
import br.com.alura.screenmatch.models.RecommendationFilter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("Django: Unchained");
        myMovie.setReleaseYear(2013);
        myMovie.setInMinutesDuration(160);

        myMovie.showMovieInfos();
        myMovie.madeAvaliation(5);
        myMovie.madeAvaliation(10);
        System.out.println(myMovie.getTotalAvaliations());
        System.out.println(myMovie.returnAverage());

        Movie anotherMovie = new Movie();
        anotherMovie.setName("O paizão");
        anotherMovie.setInMinutesDuration(200);

        Series mySerie = new Series();

        mySerie.setName("The day of jackal");
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


    }
}