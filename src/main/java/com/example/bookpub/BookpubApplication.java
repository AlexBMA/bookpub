package com.example.bookpub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.TypeExcludeFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
public class BookpubApplication {

	public static void main(String[] args) {

		SpringApplication.run(BookpubApplication.class, args);
	}

	@Bean
	public StartupRunner schedulerRunner() {
		return new StartupRunner();
	}

}
