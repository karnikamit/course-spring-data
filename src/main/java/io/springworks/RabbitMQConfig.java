package io.springworks;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.springworks.util.AppConstants;


@Configuration
public class RabbitMQConfig {

	@Bean
	public TopicExchange topicExchange() {
		return new TopicExchange(AppConstants.EXCHANGE_NAME);
	}

	@Bean
	public Queue defaultQueue() {
		return  new Queue(AppConstants.QUEUE_NAME);
	}

	@Bean
	public Binding queueToExchangeBinding() {
		return BindingBuilder.bind(defaultQueue()).to(topicExchange()).with(AppConstants.ROUTING_KEY);
	}
}
