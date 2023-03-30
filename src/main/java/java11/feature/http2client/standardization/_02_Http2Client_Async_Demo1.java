package java11.feature.http2client.standardization;

import java.net.URI;
import java.net.http.HttpClient;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _02_Http2Client_Async_Demo1 {

	public static void main(String[] args) {

		final List<URI> uris = Stream.of("https://www.google.com/", "https://github.com/", "https://www.spice.on/")
				.map(URI::create).collect(Collectors.toList());

		HttpClient httpClient = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10))
				.followRedirects(HttpClient.Redirect.ALWAYS).build();

		CompletableFuture<?>[] futures = uris.stream().map(uri -> verifyURI(httpClient, uri))
				.toArray(CompletableFuture[]::new);

		CompletableFuture.allOf(futures).join();
	}

	private static CompletableFuture<Void> verifyURI(HttpClient httpClient, URI uri) {

		HttpRequest request = HttpRequest.newBuilder().timeout(Duration.ofSeconds(5)).uri(uri).build();

		return httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString()).thenApply(HttpResponse::statusCode)
				.thenApply(statusCode -> statusCode == 200).exceptionally(ex -> false).thenAccept(valid -> {
					if (valid) {
						System.out.println("[Sucess] Verified ==> " + uri);
					} else {
						System.out.println("[Failure] Couldn't Verify ==> " + uri);
					}
				});
	}
}
