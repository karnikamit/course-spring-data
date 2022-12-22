package io.springworks.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.springworks.models.Student;
import io.springworks.rabbitMQ.Producer;

@RestController
@RequestMapping("/msg")
public class RabbirMQController {

	private static Logger logger = LoggerFactory.getLogger(RabbirMQController.class);

	@Autowired
	private Producer producer;

	@PostMapping("/student")
	public void greet(@RequestBody Student student) {
		logger.info("Received messageg from POST: {}", student.toString());
		producer.send(student);
	}
}
