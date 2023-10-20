package com.example.contactmicro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@SpringBootApplication
@EnableAsync
public class ContactMicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactMicroApplication.class, args);
	}

	@Bean(name = "asyncExecutor")
	public Executor taskExecutor(){
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(20);
		executor.setMaxPoolSize(1000);
		executor.setQueueCapacity(100);
		executor.setThreadNamePrefix("Async-");
		executor.initialize();
		return executor;
	}
}
