package com.travelApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories
public class TravelAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelAppApplication.class, args);
	}

}
