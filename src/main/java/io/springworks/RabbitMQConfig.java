package io.springworks;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.springworks.util.AppConstants;


@Configuration
public class RabbitMQConfig {

	@Bean
	public Queue queue() {
		return  new Queue(AppConstants.QUEUE_NAME);
	}

}
