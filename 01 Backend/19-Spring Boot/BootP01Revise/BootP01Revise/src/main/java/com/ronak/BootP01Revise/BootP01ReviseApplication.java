package com.ronak.BootP01Revise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootP01ReviseApplication implements CommandLineRunner {

	@Autowired
	private Notification notification;

	public BootP01ReviseApplication() {

	}

	public BootP01ReviseApplication(Notification notification) {
		this.notification = notification;
	}

	public static void main(String[] args) {
		SpringApplication.run(BootP01ReviseApplication.class, args);
	}

	public void run(String... args) {
		notification.notifyUser();
	}
}
