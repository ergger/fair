package com.park.fair;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.park.fair.entity.ThemeParkRide;
import com.park.fair.repository.ThemeParkRideRepository;

@SpringBootApplication
public class FairApplication {

	public static void main(String[] args) {
		SpringApplication.run(FairApplication.class, args);
	}

	@Bean
	public CommandLineRunner sampleData(ThemeParkRideRepository repository) {
		return (args) -> {
			repository.save(new ThemeParkRide("Rollercoaster","Train ride that speed you along", 5, 3));
			repository.save(new ThemeParkRide("Log flume","Boat ride with plenty of splashes", 3, 2));
			repository.save(new ThemeParkRide("Teacups", "Spining ride in a giant tea-cup", 2, 4));
		};
	}
}
