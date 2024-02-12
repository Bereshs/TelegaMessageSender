# Sender message from Apache Kafka to Telegram bot

project contains following modules
1. Apache Kafka consumer
2. Telegram bot message sender (by get request)

## Environment
To run project add 
```
telegram.bot.token=<YOU TOKEN> 
```
in application.yml

## Basic interactions
You mast send in Apache Kafka group tmessage with body:
```
{
   groip_id: <UserId>,
   token: <BOT TOKEN>,
   text:  <Text message>
}
```
for sending telegram message.

