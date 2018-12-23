package com.ar.maxger.pregobar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
//@ComponentScan(basePackages = "com.ar.maxger.pregobar")
@EnableJpaRepositories("com.ar.maxger.pregobar.repository")
@EntityScan("com.ar.maxger.pregobar.entity")
public class PregoBarApplication {

	public static void main(String[] args) {
		SpringApplication.run(PregoBarApplication.class, args);
	}

}


