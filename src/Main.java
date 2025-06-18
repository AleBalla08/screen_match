import br.com.alura.screenmatch.models.Movie;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.name = "Django: Unchained";
        myMovie.releaseYear = 2013;
        myMovie.planIncluded = true;
        myMovie.inMinutesDuration = 160;

        myMovie.showMovieInfos();
        myMovie.madeAvaliation(5);
        myMovie.madeAvaliation(10);
        System.out.println(myMovie.getTotalAvaliations());
        System.out.println(myMovie.returnAverage());

    }
}