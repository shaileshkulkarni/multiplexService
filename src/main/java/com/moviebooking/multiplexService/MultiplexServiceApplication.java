package com.moviebooking.multiplexService;

import jakarta.transaction.Transactional;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAutoConfiguration
@EnableTransactionManagement
public class MultiplexServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiplexServiceApplication.class, args);
	}

}
