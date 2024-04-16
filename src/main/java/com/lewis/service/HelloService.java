package com.lewis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lewis.repo.HelloRepository;

@Service
public class HelloService implements IHelloService{

	@Autowired
	private HelloRepository helloRepository;
	
	@Override
	public String getHello() {
		return helloRepository.qryHello();
	}

	
}
