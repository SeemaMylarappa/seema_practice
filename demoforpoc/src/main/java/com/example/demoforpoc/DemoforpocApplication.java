package com.example.demoforpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Appointment API", version = "2.0", description = "Appointments Information"))
public class DemoforpocApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoforpocApplication.class, args);
	}

}
