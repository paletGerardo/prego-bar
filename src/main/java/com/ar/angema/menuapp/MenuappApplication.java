package com.ar.angema.menuapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
//@ComponentScan(basePackages = "com.ar.maxger.pregobar")
@EnableJpaRepositories("com.ar.angema.menuapp")
@EntityScan("com.ar.angema.menuapp")
public class MenuappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MenuappApplication.class, args);
	}

}


