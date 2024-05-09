package com.empresaqtx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class EmpresaQtxApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpresaQtxApplication.class, args);
	}

}
