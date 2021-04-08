package com.revature.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.revature.config.AppConfig;

@Component
public class JmsMessageListener {


private static final String DESTINATION = AppConfig.EXAMPLE_QUEUE;
	
	@JmsListener(destination = DESTINATION)
	public void printMessage(String msg) {
		
		System.out.println("Message Recieved: " + msg);
		
	}

}
