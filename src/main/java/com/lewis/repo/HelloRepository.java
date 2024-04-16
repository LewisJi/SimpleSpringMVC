package com.lewis.repo;

import org.springframework.stereotype.Repository;

@Repository
public class HelloRepository {
	
	public String qryHello() {
		return "Hello, Spring MVC !";
	}
}
