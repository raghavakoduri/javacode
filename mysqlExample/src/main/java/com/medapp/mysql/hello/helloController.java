package com.medapp.mysql.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
	@RequestMapping("/hello")
    public String sayHello() {
        return "Hi First Spring boot application ";
    }

}
