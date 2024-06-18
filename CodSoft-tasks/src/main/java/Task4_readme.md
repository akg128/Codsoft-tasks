Dynamic Currency Converter
==========================

### Overview

This Java program uses the ExchangeRate-API to retrieve the latest exchange rates and convert an amount from one currency to another.

### API Request
---------------

To retrieve the latest exchange rates, we send a GET request to the ExchangeRate-API using the `HttpURLConnection` class.

```java
URL url = new URL(BASE_URL + baseCurrency);
HttpURLConnection request = (HttpURLConnection) url.openConnection();
request.setRequestMethod("GET");
request.connect();
```

In this code:

* `BASE_URL` is the base URL for the API request.
* `baseCurrency` is the base currency for the conversion (e.g., USD).
* We create a `URL` object with the base URL and base currency.
* We open a connection to the URL using `openConnection()` and cast it to an `HttpURLConnection`.
* We set the request method to "GET" using `setRequestMethod()`.
* We connect to the API using `connect()`.

### JSON Parsing
--------------

Once we receive the response from the API, we parse the JSON data using the `JsonParser` class from the Google Gson library.

```java
JsonParser parser = new JsonParser();
JsonObject jsonObject = parser.parse(new InputStreamReader(request.getInputStream())).getAsJsonObject();
```

In this code:

* We create a `JsonParser` object to parse the JSON data.
* We create an `InputStreamReader` object to read the input stream from the API response.
* We parse the JSON data using `parse()` and get the resulting `JsonObject`.
* We cast the parsed object to a `JsonObject` using `getAsJsonObject()`.

### Exchange Rate Extraction
-------------------------

Once we have the parsed JSON data, we extract the exchange rate for the target currency.

```java
double exchangeRate = ((JsonObject) jsonObject).get("conversion_rates").getAsJsonObject().get(targetCurrency).getAsDouble();
```

In this code:

* We access the "conversion_rates" object within the parsed JSON data.
* We get the exchange rate for the target currency using `get()` and cast it to a `double`.
* We store the exchange rate in the `exchangeRate` variable.

### Currency Conversion
-------------------

Finally, we calculate the converted amount by multiplying the input amount by the exchange rate.

```java
double convertedAmount = amount * exchangeRate;
```

In this code:

* We multiply the input `amount` by the `exchangeRate` to get the converted amount.
* We store the converted amount in the `convertedAmount` variable.

### Example Output
-----------------

Here is an example of the program's output:

```
Welcome to the Dynamic Currency Converter!
Enter the base currency (e.g., USD): USD
Enter the target currency (e.g., EUR): EUR
Enter the amount to convert: 100
100.00 USD is 88.12 EUR.
```

### Note
-----

Replace `cd513cef3ae236db26ee39df` with your actual API key from the ExchangeRate-API.

### Code Structure
-----------------

* `Task4.java`: The main Java file containing the program's logic.
* `com.google.gson.JsonParser`: Used for parsing the JSON response from the API.
* `java.net.HttpURLConnection`: Used for sending the GET request to the API.

### Requirements
--------------

* Java 8 or later
* ExchangeRate-API key
* Google Gson library for JSON parsing
