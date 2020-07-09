package com.medapp.mysql;

//import com.spring.boot.entry.hello.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import com.medapp.mysql.Service.ProductService;

import com.medapp.mysql.hello.helloController;

@SpringBootApplication
@ComponentScan(basePackages= {"com.medapp.mysql.Controller"})
@ComponentScan(basePackages= {"com.medapp.mysql.Service"})
public class MysqlExampleApplication {
	
	public static void main(String[] args) 
	{
		SpringApplication.run(MysqlExampleApplication.class, args);
	}

}
