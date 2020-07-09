package com.spring.boot.entry.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hello")
    public String sayHello() {
        return "Hi First Spring boot application ";
    }

}
