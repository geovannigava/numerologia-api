package com.exemplo.numerologiaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.exemplo.numerologiaapi.config.property.NumerologiaApiProperty;

@SpringBootApplication
@EnableConfigurationProperties(NumerologiaApiProperty.class)
public class NumerologiaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(NumerologiaApiApplication.class, args);
	}
}
