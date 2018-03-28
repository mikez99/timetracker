package com.timetracker.timetracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com.timetracker.timetracker")
@SpringBootApplication
public class TimetrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimetrackerApplication.class, args);
	}
}
