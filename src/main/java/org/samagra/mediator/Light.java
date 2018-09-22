package org.samagra.mediator;

import java.util.logging.Logger;

public class Light {

	private static final Logger log = Logger.getLogger(Light.class.getName());
	
	private boolean isOn= false;
	
	private String location = "";
	
	public Light() {
		
	}
	
	public Light(String location) {
		this.location = location;
	}
	
	public boolean isOn() {
		return  isOn;
	}
	
	public void toggle() {
		if(isOn) {
			off();
		}
		else {
			on();
		}
	}

	public void on() {
		String message = generateMessage("on");
		log.info(message);
		isOn = true;	
	}

	public void off() {
		String message = generateMessage("off");
		log.info(message);
		isOn = false;	
	}

	public String generateMessage(String state) {
		StringBuilder builder = new StringBuilder();
		builder.append(this.location);
		builder.append(" ");
		builder.append("is");
		builder.append(" ");
		builder.append("turned");
		builder.append(" ");
		builder.append(state);
		return builder.toString();
	}
}
