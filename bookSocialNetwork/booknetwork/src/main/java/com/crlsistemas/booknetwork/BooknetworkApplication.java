package com.crlsistemas.booknetwork;



import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableAsync;

import com.crlsistemas.booknetwork.role.Role;
import com.crlsistemas.booknetwork.role.RoleRepository;


@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
@EnableAsync
@ComponentScan(basePackages = "com.crlsistemas.booknetwork")
public class BooknetworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooknetworkApplication.class, args);
	}
	

	@Bean
	public CommandLineRunner runner(RoleRepository roleRepository) {
		return args -> {
			if (roleRepository.findByName("USER").isEmpty()) {
				roleRepository.save(
						Role.builder().name("USER").build());
			}
		};
	}
}