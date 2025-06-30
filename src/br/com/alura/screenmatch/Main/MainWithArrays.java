package br.com.alura.screenmatch.Main;

import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Series;
import br.com.alura.screenmatch.models.Title;

import java.util.ArrayList;

public class MainWithArrays {
    public static void main(String[] args) {
        var thirdMovie = new Movie("Bastardos Inglorios", 2009);
        Series mySerie = new Series("The day of jackal", 2023);
        Movie anotherMovie = new Movie("O paizão",1999);
        Movie myMovie = new Movie("Django: Unchained", 2013);

        ArrayList<Title> list = new ArrayList<>();
        list.add(myMovie);
        list.add(anotherMovie);
        list.add(thirdMovie);
        list.add(mySerie);

        int i;
        for(i=0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
