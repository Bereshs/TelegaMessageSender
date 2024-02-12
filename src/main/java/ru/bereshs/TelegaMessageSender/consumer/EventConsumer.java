package ru.bereshs.TelegaMessageSender.consumer;


public interface EventConsumer<T extends Event> {
    void consumeEvent(T event);

}