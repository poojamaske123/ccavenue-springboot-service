package com.himcab.CcAvenue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.himcab.CcAvenue.controller"})
public class CcAvenueApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(CcAvenueApplication.class, args);
	}

}
