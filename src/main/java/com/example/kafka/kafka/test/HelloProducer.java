package com.example.kafka.kafka.test;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class HelloProducer {
	@SuppressWarnings("unused")
	private KafkaTemplate<String, String> kafkaTemplate;

	public HelloProducer(KafkaTemplate<String, String> kafkaTemplate) {
		
		this.kafkaTemplate = kafkaTemplate;
	}
	public void sendMessage (String message) {
		kafkaTemplate.send(topic:"hello-topic", message );
	}

}
