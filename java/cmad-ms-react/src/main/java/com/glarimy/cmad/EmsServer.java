package com.glarimy.cmad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmsServer {
	public static void main(String[] args) {
		System.out.printl(" RUNNING THE EM SERVER====");
		SpringApplication.run(EmsServer.class, args);
	}
}
