package com.niit.ActivityStreamBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages= {"com.niit"})
@EntityScan(basePackages= {"com.niit.ActivityStreamBackend.model"})
public class ActivityStreamBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActivityStreamBackendApplication.class, args);
	}

}
