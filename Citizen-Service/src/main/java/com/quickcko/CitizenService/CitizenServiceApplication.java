package com.quickcko.CitizenService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@ComponentScan("com**")
//@EnableEurekaClient
public class CitizenServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CitizenServiceApplication.class, args);
	}
	
	@Bean
    public javax.sql.DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost/citizen_DB");
        dataSource.setUsername("postgres");
        dataSource.setPassword("root");
        return dataSource; 
    }
	@Bean
	//@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
