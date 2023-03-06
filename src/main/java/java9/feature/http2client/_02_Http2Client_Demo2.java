package java9.feature.http2client;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

public class _02_Http2Client_Demo2 {

	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(new URI("https://www.redbus.in/info/aboutus")).GET().build();
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println("Response Status Code  ==> " + response.statusCode());
		System.out.println("Response Version Code ==> " + response.version());
		HttpHeaders header = response.headers();
		Map<String, List<String>> headers = header.map();
		headers.forEach((key, value) -> System.out.println("Response Headers      ==> " + key + " : " + value));
		System.out.println("Response Body         ==> " + response.body());
	}
}
