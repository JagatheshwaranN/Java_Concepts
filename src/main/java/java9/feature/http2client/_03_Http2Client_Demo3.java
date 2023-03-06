package java9.feature.http2client;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.nio.file.Paths;

public class _03_Http2Client_Demo3 {

	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(new URI("https://www.redbus.in/info/aboutus")).GET().build();
		HttpResponse<Path> response = client.send(request, HttpResponse.BodyHandlers.ofFile(Paths.get("HttpClientDemo3.html")));
		System.out.println("Response Status Code  ==> " + response.statusCode());
	}
}
