package JavaPractice.REST_API;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws Exception {

        Transcript transcript = new Transcript();
        transcript.setAudio_url("https://github.com/donura24/JavaPractice/raw/main/240895.wav");



        HttpRequest postRequest = HttpRequest.newBuilder()
                .uri(new URI("https://api.assemblyai.com/v2/transcript"))
                .header("Authorization", "b244a137272e401289ac45959b940c78")
                .POST(HttpRequest.BodyPublishers.ofString("{\"audio_url\": \"https://github.com/donura24/JavaPractice/raw/main/240895.wav\"}"))
                .build();

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String> postResponse = httpClient.send(postRequest, HttpResponse.BodyHandlers.ofString());

        System.out.println(postResponse.body());

        //HttpRequest getRequest = HttpRequest.newBuilder().build();
    }
}
