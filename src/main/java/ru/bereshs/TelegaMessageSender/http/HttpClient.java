package ru.bereshs.TelegaMessageSender.http;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;


@Service
@Slf4j
public class HttpClient {
    private final WebClient webClientBuilder;

    @Value("${telegram.uri.request}")
    private String request;

    public HttpClient() {
        this.webClientBuilder = WebClient.create();
    }

    public void getRequest(String token, String chatId, String message) {
        String requestUrl = request +
                token +
                "/sendMessage?chat_id=" +
                chatId +
                "&text=" +
                message;
        log.info("Creating http get request " + requestUrl);

        webClientBuilder.get()
                .uri(requestUrl)
                .retrieve()
                .bodyToMono(Void.class)
                .doOnError(error -> log.info("Request error {}", error.getMessage()))
                .block();
        ;

    }
}

