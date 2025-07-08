package com.alura.conversor.api;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {
    private static final String API_KEY = "f13a631450c89e5addff72f9";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/";
    private static final Gson gson = new Gson();

    public static double converterMoeda(String moedaOrigem, String moedaDestino, double valor) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            String url = BASE_URL + moedaOrigem + "/" + moedaDestino + "/" + valor;

            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                JsonObject jsonResponse = gson.fromJson(response.body(), JsonObject.class);
                if (jsonResponse.get("result").getAsString().equals("success")) {
                    return jsonResponse.get("conversion_result").getAsDouble();
                }
            }
            throw new RuntimeException("Erro na conversão: " + response.body());
        } catch (Exception e) {
            throw new RuntimeException("Falha ao converter moeda: " + e.getMessage(), e);
        }
    }
}