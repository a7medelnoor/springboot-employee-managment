package com.a7medelnoor.springbootemployemanagment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringbootEmployeManagmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEmployeManagmentApplication.class, args);
	}

}
