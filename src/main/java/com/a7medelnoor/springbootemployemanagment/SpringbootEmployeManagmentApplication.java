package com.a7medelnoor.springbootemployemanagment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.a7medelnoor.springbootemployemanagment.model"})  // force scan JPA entities
public class SpringbootEmployeManagmentApplication {
	private static ConfigurableApplicationContext applicationContext;


	public static void main(String[] args) {
		SpringbootEmployeManagmentApplication.applicationContext = SpringApplication.run(SpringbootEmployeManagmentApplication.class, args);
	}

}
