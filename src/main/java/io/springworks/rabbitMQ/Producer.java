package io.springworks.rabbitMQ;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.springworks.models.Student;
import io.springworks.util.AppConstants;

@Component
public class Producer {

	private static Logger logger = LoggerFactory.getLogger(Producer.class);
	@Autowired
	private Queue queue;

	@Autowired
	private RabbitTemplate rabbitTemplate;

	public void send(Student message) {
		logger.info("sending message: {}", message);
		rabbitTemplate.convertAndSend(AppConstants.QUEUE_NAME, message.toString());
	}
}
