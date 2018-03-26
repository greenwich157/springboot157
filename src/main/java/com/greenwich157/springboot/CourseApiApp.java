package com.greenwich157.springboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(CourseApiApp.class, args);

	}

}
