package org.samagra.behavioural.observer;

import java.util.logging.Logger;

public class TabletClient extends Observer{

	private static final Logger log = Logger.getLogger(PhoneClient.class.getName());
	
	public TabletClient(Subject subject) {
		this.subject = subject;
		this.subject.attachObserver(this);
	}

	public void addMessage(String message) {
		subject.setState(message+" - sent from tablet");
	}


	@Override
	void update() {
		log.info("Tablet Stream :"+subject.getState());
	}
}
