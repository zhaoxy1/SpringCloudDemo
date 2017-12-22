package com.cloud.servicehello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceHelloApplication {
	@Value("${server.port}")
	private String port;
	public static void main(String[] args) {
		SpringApplication.run(ServiceHelloApplication.class, args);
	}

	@RequestMapping("/index")
	public String index(){
		return "hello world"+port;
	}
}
