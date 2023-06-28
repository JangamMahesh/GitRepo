package com.example.demo.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

	private static final Logger logger = LoggerFactory.getLogger(Producer.class);

	private KafkaTemplate<String, String> kafkaTemplate;

	public Producer(KafkaTemplate<String, String> kafkaTemplate) {
		super();
		this.kafkaTemplate = kafkaTemplate;
	}

	public void sendMessage(String msg) {
		logger.info(String.format("PRoducer msg %s", msg));
		kafkaTemplate.send("javaguides", msg);
	}

}
