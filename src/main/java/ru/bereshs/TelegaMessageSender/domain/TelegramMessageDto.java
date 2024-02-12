package ru.bereshs.TelegaMessageSender.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import ru.bereshs.TelegaMessageSender.consumer.Event;

@Builder
@Getter
@Setter
public class TelegramMessageDto implements Event {

    private String token;
    private String chatId;
    private String message;

    @Override
    public String getEvent() {
        return "tmessage";
    }
}
