package com.greatlearning.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@ComponentScan(basePackages = { "com.greatlearning.employee.*" })
@SpringBootApplication
@EnableWebSecurity
public class SpringBootEmployeeDesignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmployeeDesignApplication.class, args);
		System.out.println("YAY!!! Your Employee Management Rest API app is Up and Running :)");
	}

}
