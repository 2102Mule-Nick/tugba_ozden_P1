package com.revature.messaging;
import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;


@Service
public class JmsMessageSender {


	private JmsTemplate jmsTemplate;

	private Queue destinationQueue;
	
	@Autowired
	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	@Autowired
	public void setDestinationQueue(Queue destinationQueue) {
		this.destinationQueue = destinationQueue;
	}
	
	public void sendMessage(String msg) {
		
		jmsTemplate.send(destinationQueue, (session) -> session.createTextMessage(msg));
		
		System.out.println("...................work?.............");
		
	}
	
}
