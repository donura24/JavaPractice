package JavaPractice.REST_API;

import java.net.URI;
import java.net.http.HttpRequest;

public class Main {
    public static void main(String[] args) throws Exception {

        Transcript transcript = new Transcript();
        transcript.setAudio_url("https://github.com/donura24/JavaPractice/raw/main/240895.wav");
        Gson gson = new Gson();

        HttpRequest postRequest = HttpRequest.newBuilder()
                .uri(new URI("https://api.assemblyai.com/v2/transcript"))
                .header("Authorization", "b244a137272e401289ac45959b940c78")
                .POST(HttpRequest.BodyPublishers.ofString())
    }
}
