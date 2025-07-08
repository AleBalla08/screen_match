package br.com.alura.screenmatch.Main;

import br.com.alura.screenmatch.exceptions.ConvertYearException;
import br.com.alura.screenmatch.models.Title;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApis {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Gson gson = new GsonBuilder().setPrettyPrinting().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

        String search = "";
        List<Title> titles = new ArrayList<>();

        while (true) {
            System.out.println("Qual file deseja consultar? ( ou digite 'sair') ");
            search = scanner.nextLine();

            if (search.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                String uri = "https://www.omdbapi.com/?t=" + search.replaceAll(" ", "_") + "&apikey=d4c7470f";

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(uri))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                OmdbTitle myOmdbTitle = gson.fromJson(json, OmdbTitle.class);
                System.out.println("title: "+ myOmdbTitle);

                Title myTitle = new Title(myOmdbTitle);

                System.out.println("MY TITLE: " + myTitle);

                titles.add(myTitle);
            } catch (ConvertYearException e){
                System.out.println(e.getMessage());
            }
        }

        FileWriter writer = new FileWriter("movies.json");
        writer.write(gson.toJson(titles));
        writer.close();

        System.out.println(titles);
        System.out.println("O programa foi encerrado...");

    }
}
