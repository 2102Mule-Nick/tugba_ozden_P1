package com.revature.messaging;
import javax.jms.Queue;
import javax.jms.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;


@Service
public class JmsMessageSender {


	private JmsTemplate jmsTemplate;

	private Queue destinationQueue;
	
	//private Topic destinationTopic;
	
	@Autowired
	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	@Autowired
	public void setDestinationQueue(Queue destinationQueue) {
		this.destinationQueue = destinationQueue;
	}	
	
	/*@Autowired
	public void setDestinationTopic(Topic destinationTopic) {
		this.destinationTopic = destinationTopic;
	}*/

	public void sendMessage(String msg) {
		
		jmsTemplate.send(destinationQueue, (session) -> session.createTextMessage(msg));
		
		//jmsTemplate.send(destinationTopic, (session) -> session.createTextMessage(msg));	
		
		
		System.out.println(".................message sender work?.............");
		
	}
	
}
