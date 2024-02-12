package ru.bereshs.TelegaMessageSender;

import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class TelegaMessageSenderService {

	public static void main(String[] args) {
		SpringApplication.run(TelegaMessageSenderService.class, args);
	}

}
