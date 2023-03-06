package java9.feature.http2client;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * HTTP/2 client is one of the most exciting features, for which developers are
 * waiting for long time. By using this new HTTP/2 client, from java application
 * we can send HTTP Request and we can process HTTP Response.
 * 
 * Light weight and easy to use. Supports HTTP/1.1 and HTTP/2. (Handles both
 * Text data and Binary data). Allows to send multiple requests at a time.
 * Supports both synchronous and Asynchronous mode. It provides better
 * performance and scalability when compared with HttpURLConnection.
 * 
 * @author Jagatheshwaran N
 *
 */
public class _01_Http2Client_Demo1 {

	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(new URI("https://www.redbus.in/info/aboutus")).GET().build();
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println("Response of request sent ==> " + response);
	}
}
