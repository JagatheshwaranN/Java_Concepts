package java11.feature.http2client.standardization;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

/**
 * The new HTTP client from the java.net.http package was introduced in Java 9.
 * It has now become a standard feature in Java 11. JDK 11 includes the new
 * HttpClient class, which significantly simplifies working with HTTP.
 * 
 * @author Jagatheshwaran N
 */
public class _01_Http2Client_Demo1 {

	public static void main(String[] args) {

		HttpClient httpClient = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10))
				.version(HttpClient.Version.HTTP_2).build();
		HttpResponse<String> response = null;
		try {
			String urlEndPoint = "https://reqres.in/api/users";
			URI uri = URI.create(urlEndPoint + "?id=2");
			HttpRequest request = HttpRequest.newBuilder().uri(uri).build();

			response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}

		System.out.println("Status Code ===> " + response.statusCode());
		System.out.println("Headers     ===> " + response.headers().allValues("content-type"));
		System.out.println("Body        ===> " + response.body());
	}
}
