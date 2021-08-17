package com.digitalinnovationone.SpringBoot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import lombok.Getter;
import lombok.Setter;

@Configuration
@ConfigurationProperties("spring.datasource")
@Setter
@Getter
public class DBConfiguration {

	private String driverClassName;
	private String url;
	@SuppressWarnings("unused")
	private String username;
	@SuppressWarnings("unused")
	private String password;

	@Profile("dev")
	@Bean
	public String testDataBaseConnection() {
		System.out.println("DB connection for DEV - H2");
		System.out.println(driverClassName);
		System.out.println(url);
		return "<strong>DB Connection to H2_TEST - Test instance</strong>";

	}

	@Profile("prod")
	@Bean
	public String productionDataBaseConnection() {
		System.out.println("DB connection for Production - MySql");
		System.out.println(driverClassName);
		System.out.println(url);
		return "<strong>DB Connection to MYSQL_TEST - Production instance</strong>";

	}

}
