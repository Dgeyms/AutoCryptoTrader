package com.example.autocryptotrader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@SpringBootApplication(scanBasePackages = "com.example.autocryptotrader")
public class AutoCryptoTraderApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoCryptoTraderApplication.class, args);
	}
}
