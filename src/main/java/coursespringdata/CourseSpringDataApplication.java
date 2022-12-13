package coursespringdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "io.springworks")
public class CourseSpringDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseSpringDataApplication.class, args);
	}

}
