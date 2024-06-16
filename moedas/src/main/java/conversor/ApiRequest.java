package conversor;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

import com.google.gson.Gson;

public class ApiRequest {

    private static final String API_KEY = "https://v6.exchangerate-api.com/v6/1405ded8acf14eafe7285949/latest/USD";

    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(API_KEY)).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 200) {
                String responseBody = response.body();
                Gson gson = new Gson();
                ApiResponse apiResponse = gson.fromJson(responseBody, ApiResponse.class);
                System.out.println(apiResponse);
            } else {
                System.out.println("Error: " + response.statusCode());
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ApiResponse {
    private String base_code;
    private Map<String, Double> conversion_rates;

    // Getters e Setters
    public String getBaseCode() {
        return base_code;
    }

    public void setBaseCode(String base_code) {
        this.base_code = base_code;
    }

    public Map<String, Double> getConversionRates() {
        return conversion_rates;
    }

    public void setConversionRates(Map<String, Double> conversion_rates) {
        this.conversion_rates = conversion_rates;
    }

    @Override
    public String toString() {
        return "ApiResponse{base_code='" + base_code + "', conversion_rates=" + conversion_rates + "}";
    }
}
