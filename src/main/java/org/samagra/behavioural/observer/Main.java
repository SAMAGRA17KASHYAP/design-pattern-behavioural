package org.samagra.behavioural.observer;

public class Main {

	public static void main(String[] args) {

		Subject messageStream = new MessageStream();
		PhoneClient phoneClient = new PhoneClient(messageStream);
		TabletClient tabletClient = new TabletClient(messageStream);
		phoneClient.addMessage("Message from phone");
		tabletClient.addMessage("Message from tabet");
		
	}

}
