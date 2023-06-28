package com.example.demo.subscriber;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;

public class Reciever implements MessageListener {

	private static Logger logger = LoggerFactory.getLogger(Reciever.class);

	@Override
	public void onMessage(Message message, byte[] pattern) {
		// TODO Auto-generated method stub
		logger.info("messageConsumed {}" , message);

	}

}
