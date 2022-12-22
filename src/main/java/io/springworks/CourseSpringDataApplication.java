package io.springworks;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class CourseSpringDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseSpringDataApplication.class, args);
	}

}
