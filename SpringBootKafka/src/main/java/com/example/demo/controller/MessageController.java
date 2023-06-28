package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.kafka.Producer;

@RestController
@RequestMapping("v1")
public class MessageController {

	@Autowired
	private Producer producer;

	/// v1/publish?msg=mahesh
	@GetMapping("/publish")
	public ResponseEntity<String> publishMessage(@RequestParam("msg") String message) {
		producer.sendMessage(message);
		return ResponseEntity.ok("Message sent to topic");
	}

}
