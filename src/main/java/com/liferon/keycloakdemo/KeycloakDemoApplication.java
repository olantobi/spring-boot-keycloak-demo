package com.liferon.keycloakdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KeycloakDemoApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(KeycloakDemoApplication.class);
    
	public static void main(String[] args) {
                LOGGER.info("Starting keycloak demo app...");
		SpringApplication.run(KeycloakDemoApplication.class, args);
	}
}
