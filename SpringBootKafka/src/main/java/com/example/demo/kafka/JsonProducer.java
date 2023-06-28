package com.example.demo.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;

@Service
public class JsonProducer {

	private static final Logger logger = LoggerFactory.getLogger(JsonProducer.class);

	private KafkaTemplate<String, User> kafkaTemplate;

	public JsonProducer(KafkaTemplate<String, User> kafkaTemplate) {
		super();
		this.kafkaTemplate = kafkaTemplate;
	}
	public void sendMessage(User user) {
		logger.info("mesage send use " + user.toString());
		Message<User> message = MessageBuilder.withPayload(user).setHeader(KafkaHeaders.TOPIC, "javaguides_json").build();
		kafkaTemplate.send(message);
	}

}
