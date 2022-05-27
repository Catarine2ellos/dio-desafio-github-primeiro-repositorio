package com.httexample;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.time.Duration;
import java.io.FileNotFoundException;

public class postRequest {
    public static final String URL_POST = "http://httpbin.org/get";

    ///descobrir esse erro

    public static final String FILE_Json = "/catar/IdeaProjects/HttpExample/src/com/httexample/pedido.json";

    public static void main(String[] args) throws IOException, InterruptedException {

        //client HTTP
        HttpClient client = HttpClient.newHttpClient();

        // criar a requisição

        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofFile(Path.of(FILE_Json)))
                .timeout(Duration.ofSeconds(10))
                .uri(URI.create(URL_POST))
                .build();
        // enviando uma solicitação

        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();


    }

}