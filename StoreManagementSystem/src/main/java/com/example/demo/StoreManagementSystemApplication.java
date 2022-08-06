package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.*;

@EnableSwagger2
@SpringBootApplication
public class StoreManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreManagementSystemApplication.class, args);
	}
	
	public Docket swaggerFun() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.example.demo")).build();
	}

}
