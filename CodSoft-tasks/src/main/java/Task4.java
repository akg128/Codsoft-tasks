//CURRENCY CONVERTER

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Task4 {
 private static final String API_KEY = "cd513cef3ae236db26ee39df"; // Replace YOUR_API_KEY with your actual API key
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/";

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Dynamic Currency Converter!");
        System.out.print("Enter the base currency (e.g., USD): ");
        String baseCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Enter the target currency (e.g., EUR): ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();
        scanner.close(); // Ensure the Scanner is closed properly

        try {
            URL url = new URL(BASE_URL + baseCurrency);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.setRequestMethod("GET");
            request.connect();

            // Close the connection after reading the response
            int responseCode = request.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
               JsonParser parser = new JsonParser();
                JsonObject jsonObject = parser.parse(new InputStreamReader(request.getInputStream())).getAsJsonObject();

                // Assuming jsonObject is already defined as shown above
                double exchangeRate = ((JsonObject) jsonObject).get("conversion_rates").getAsJsonObject().get(targetCurrency).getAsDouble();


                double convertedAmount = amount * exchangeRate;
                System.out.printf("%.2f %s is %.2f %s.%n", amount, baseCurrency, convertedAmount, targetCurrency);
            } else {
                System.out.println("Failed to retrieve exchange rates.");
            }

            // Always close the connection
            request.disconnect();
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
