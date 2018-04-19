package com.greenwich157.springboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class CourseApiApp extends SpringBootServletInitializer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(CourseApiApp.class, args);
	}
	// test comments
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(CourseApiApp.class);
	}
}
