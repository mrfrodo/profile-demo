package com.frodo.demo;

import com.frodo.demo.config.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	@Autowired
	private Properties properties;

	@Override
	public void run(String... args) {
		System.out.println(properties);
	}

	public static void main(String[] args) {

		logger.info("\n\n________Starting DemoApplication______\n\n");

		SpringApplication app = new SpringApplication(DemoApplication.class);

		app.setAdditionalProfiles("dev");
		app.setAdditionalProfiles("test");
		app.setAdditionalProfiles("prod");

		app.run(args);

		System.exit(0);
	}

}
