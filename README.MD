# TelegaMessgaeSender

Проект включает в себя следующие модули:
1. Apache Kafka consumer (потребитель сообщений kafka)
2. Telegram bot message sender (отправка происодит посредствам GET запроса)

## Переменные
Для запуска проекта добавьте в application.properties строку 
```
server.kafka.bootstrap-servers=<YOU KAFKA SERVER ADDRESS>
```

## Интеграия с сервисами
Для отправки сообщений телеграм боту отправьте в группу tmessage следующее сообщение:
```
{
   groip_id: <UserId>,
   token: <BOT TOKEN>,
   text:  <Text message>
}
```
## Зависимости:
- Apache kafka, zookeper

