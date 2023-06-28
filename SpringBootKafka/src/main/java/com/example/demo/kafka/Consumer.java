package com.example.demo.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	private static final Logger logger = LoggerFactory.getLogger(Consumer.class);

	@KafkaListener(topics = "javaguides", groupId = "myGroup")
	public void consumeMessage(String msg) {

		logger.info("msages conusmer" + msg);
	}
}
