package br.com.alura.screenmatch.Main;

import br.com.alura.screenmatch.exceptions.ConvertYearException;
import br.com.alura.screenmatch.models.Title;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainApis {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual file deseja consultar? ");
        String search = scanner.nextLine();

        try {
            String uri = "https://www.omdbapi.com/?t=" + search.replaceAll(" ", "_") + "&apikey=d4c7470f";

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(uri))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println("Corpo: " + json);

            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
            OmdbTitle myOmdbTitle = gson.fromJson(json, OmdbTitle.class);
            System.out.println("title: "+ myOmdbTitle);

            Title myTitle = new Title(myOmdbTitle);

            System.out.println("MY TITLE: " + myTitle);
        } catch (ConvertYearException e){
            System.out.println(e.getMessage());
        }


    }
}
