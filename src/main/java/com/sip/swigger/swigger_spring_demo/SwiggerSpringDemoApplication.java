package com.sip.swigger.swigger_spring_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Employee Api"
								,version = "2.0",
								description = "Employees Information"))
public class SwiggerSpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwiggerSpringDemoApplication.class, args);
	}

}
