package com.himcab.CcAvenue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.himcab.CcAvenue.controller"})
public class CcAvenueApplication {

	public static void main(String[] args) {
		SpringApplication.run(CcAvenueApplication.class, args);
	}

}
