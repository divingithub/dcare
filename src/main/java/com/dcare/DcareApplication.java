package com.dcare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages = "com.dcare.schedules")
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class DcareApplication {

	public static void main(String[] args) {
		SpringApplication.run(DcareApplication.class, args);
	}

}
