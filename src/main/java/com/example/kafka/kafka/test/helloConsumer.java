package com.example.kafka.kafka.test;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class helloConsumer {

	@KafkaListener(topics = "hello-topic", groupId = "group-1")
	public void receiveMessage(String message) {
	
	System.out.println("Consumere Message: " + message );
}

}
