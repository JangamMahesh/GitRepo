package com.example.demo.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;

@Service
public class JsonConsumer {

	
	@KafkaListener(topics="javatehie_json",groupId="myGroup")
	public void getUser(User user)
	{
		System.out.println("user " + user);
		
	}
}
