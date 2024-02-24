package com.example.autocryptotrader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.autocryptotrader")
public class AutoCryptoTraderApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoCryptoTraderApplication.class, args);
	}
}
