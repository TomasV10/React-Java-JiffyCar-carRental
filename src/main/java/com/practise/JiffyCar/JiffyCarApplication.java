package com.practise.JiffyCar;

import com.practise.JiffyCar.services.FileStorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class JiffyCarApplication implements CommandLineRunner {

	@Resource
	FileStorageService fileStorageService;


	public static void main(String[] args) {
		SpringApplication.run(JiffyCarApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		fileStorageService.deleteAll();
		fileStorageService.init();
	}
}
