package com.revature.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.security.Permission;

/**
 * The entry point for the Spring application.
 */
@SpringBootApplication
@ComponentScan("com.revature")
@EntityScan("com.revature.entities")
@EnableJpaRepositories("com.revature.repositories")
public class RevaRewardsApplication {

	public static void main(String[] args) {
		forbidSystemExitCall();
		SpringApplication.run(RevaRewardsApplication.class, args);
	}

	private static void forbidSystemExitCall() {
		final SecurityManager securityManager = new SecurityManager() {
			@Override
			public void checkPermission(Permission permission) {
				if (permission.getName().startsWith("exitVM")) {
					throw new RuntimeException("Something called exit ");
				}
			}
		};
		System.setSecurityManager(securityManager);
	}
}
