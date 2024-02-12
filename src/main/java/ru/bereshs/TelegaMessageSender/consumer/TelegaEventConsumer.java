package ru.bereshs.TelegaMessageSender.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.bereshs.TelegaMessageSender.domain.TelegramMessageDto;
import ru.bereshs.TelegaMessageSender.http.HttpClient;

@Component
@Slf4j
public class TelegaEventConsumer implements EventConsumer<TelegramMessageDto> {

    private final HttpClient httpClient;

    @Autowired
    public TelegaEventConsumer(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    @Override
    public void consumeEvent(TelegramMessageDto event) {
        httpClient.getRequest(event.getToken(), event.getChatId(), event.getMessage());
    }
}
