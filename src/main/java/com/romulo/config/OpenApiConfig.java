package com.romulo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfig {

	@Bean
	public OpenAPI customOpenApi() {
		return new OpenAPI()
				.info(new Info()
						.title("RESTful API with Java 18 and Spring Boot 3")
						.version("v1")
						.description("Alguma descrição sobre a API")
						.termsOfService("https://github.com/romulo-analist-dev/rest-spring-boot")
						.license(new License()
								.name("Apache 2.0")
								.url("https://github.com/romulo-analist-dev/rest-spring-boot")));
	}
}
