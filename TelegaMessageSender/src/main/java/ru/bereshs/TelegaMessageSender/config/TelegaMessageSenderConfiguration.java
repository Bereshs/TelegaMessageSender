package ru.bereshs.TelegaMessageSender.config;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.bereshs.TelegaMessageSender.consumer.EventConsumer;
import ru.bereshs.TelegaMessageSender.domain.TelegramMessageDto;

import java.util.function.Consumer;

@Configuration
@AllArgsConstructor
public class TelegaMessageSenderConfiguration {

    private final EventConsumer<TelegramMessageDto> messageEventConsumer;

    @Bean
    Consumer<TelegramMessageDto> messageEventConsumer() {
        return messageEventConsumer::consumeEvent;
    }

}
