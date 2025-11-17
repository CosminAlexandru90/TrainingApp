package com.example.training_app_be;

import org.springframework.boot.SpringApplication;

public class TestTrainingAppBeApplication {

	public static void main(String[] args) {
		SpringApplication.from(TrainingAppBeApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
