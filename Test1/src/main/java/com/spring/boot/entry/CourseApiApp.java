package com.spring.boot.entry;
import com.spring.boot.entry.hello.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses= HelloController.class)
public class CourseApiApp {
	
	public static void main(String[] args) 
	{
		SpringApplication.run(CourseApiApp.class, args);
	}

}
