package com.cfs.BootP02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.webmvc.autoconfigure.WebMvcAutoConfiguration;

// if I want to do not auto configure than use this
//@SpringBootApplication(exclude = {WebMvcAutoConfiguration.class})
@SpringBootApplication // consist of 3 annotation (1. @
public class BootP02Application {

	public static void main(String[] args) {
		SpringApplication.run(BootP02Application.class, args);
	}

}
