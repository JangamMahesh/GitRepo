package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.kafka.JsonProducer;
import com.example.demo.model.User;

@RestController
@RequestMapping("/v1")
public class JsonMesageController {

	@Autowired
	private JsonProducer json;

	@PostMapping("/publish")
	public ResponseEntity<String> publish(@RequestBody User user) {
		json.sendMessage(user);
		return ResponseEntity.ok("User oobject send to tpic");

	}

}
