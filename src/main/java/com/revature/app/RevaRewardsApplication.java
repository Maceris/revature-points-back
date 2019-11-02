package com.revature.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * The entry point for the Spring application.
 */
@SpringBootApplication
@ComponentScan("com.revature")
@EntityScan("com.revature.entities")
@EnableJpaRepositories("com.revature.repositories")
public class RevaRewardsApplication {

	/**
	 * Starts up the spring application.
	 * 
	 * @param args Passed along to the spring application.
	 */
	public static void main(String[] args) {
		SpringApplication.run(RevaRewardsApplication.class, args);
	}
}
