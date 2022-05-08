package com.adidas.email;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Mail application. Send emails to inform users about the campaign subscribed.
 *
 *
 */
@SpringBootApplication
@EnableConfigurationProperties
public class EmailApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailApplication.class, args);
	}

}
