package com.revature.messaging;

import javax.jms.Queue;
import javax.jms.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;


@Service
public class JmsMessageSender {

	private JmsTemplate jmsTemplate;
	
	private Queue destinationQueue;

	private Topic topic;
	
	//private Queue inventoryQueue;
	
	
	
	@Autowired
	@Qualifier("destinationQueue")
	public void setDestinationQueue(Queue destinationQueue) {
		this.destinationQueue = destinationQueue;
	}

	/*@Autowired
	public void setInventoryQueue(Queue inventoryQueue) {
		this.inventoryQueue = inventoryQueue;
	}*/

	@Autowired
	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}
	
	
	@Autowired
	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	/*public void simpleSend(String msg) {
		
//		jmsTemplate.send(queue, (s) -> s.createTextMessage(msg));

		jmsTemplate.send(topic, (s) -> s.createTextMessage(msg));
		
	}*/
	
	/*public void sendToQueue(String msg) {
	
	}*/
	
	public void sendMessage(String msg) {
		
		//ItemInventory ii = new ItemInventory(item, quantity);
		
		//jmsTemplate.send(inventoryQueue, (s) -> s.createObjectMessage(ii));
		
		
			jmsTemplate.send(destinationQueue, (s) -> s.createTextMessage(msg));
		
	}
	
}
