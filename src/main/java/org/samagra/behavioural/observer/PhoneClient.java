package org.samagra.behavioural.observer;

import java.util.logging.Logger;

public class PhoneClient extends Observer {

	private static final Logger log = Logger.getLogger(PhoneClient.class.getName());
	
	public PhoneClient(Subject subject) {
		this.subject = subject;
		this.subject.attachObserver(this);
	}

	public void addMessage(String message) {
		subject.setState(message+" - sent from phone");
	}


	@Override
	void update() {
		log.info("Phone Stream :"+subject.getState());
	}

}
