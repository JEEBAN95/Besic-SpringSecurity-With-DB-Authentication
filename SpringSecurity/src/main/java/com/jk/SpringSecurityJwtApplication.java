package com.jk;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.jk.entity.User;
import com.jk.repository.UserRepository;

@SpringBootApplication
public class SpringSecurityJwtApplication {

	@Autowired
	private UserRepository repository;
	@PostConstruct
	public void init() {

		List<User> users = null;
		Stream<User> stream = Stream.of(new User(101, "Javaminds", "javaminds@gmail.com", "password"),
				new User(102, "user2", "user2@gmail.com", "pwd2"), new User(103, "user3", "user3@gmail.com", "pwd3"));
		users = stream.collect(Collectors.toList());
		
		repository.saveAll(users);
	}
	
	@Bean
	public PasswordEncoder encoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJwtApplication.class, args);
	}

}
