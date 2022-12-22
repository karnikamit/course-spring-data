package io.springworks.rabbitMQ;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import io.springworks.models.Student;
import io.springworks.util.AppConstants;

@Component
public class Consumer {

	private static Logger logger = LoggerFactory.getLogger(Consumer.class);

	@RabbitListener(queues = AppConstants.QUEUE_NAME)
	public void receiveMessage(final Message message) {
		logger.info("Received message: {}", message.getPayload());
		System.out.println("Message received: "+message);
	}
}
