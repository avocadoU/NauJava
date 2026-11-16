package com.example;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Task4 {
    public static void main(String[] args) throws IOException, InterruptedException {
        try (HttpClient client = HttpClient.newHttpClient())
        {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://httpbin.org/ip"))
                    .GET()
                    .build();
            HttpResponse<String> response = client.send(request,
                    HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            String ip = json.split("\"")[3];

            System.out.println("IP: " + ip);
        }
    }
}
