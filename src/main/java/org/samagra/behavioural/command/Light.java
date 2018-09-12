package org.samagra.behavioural.command;

import java.util.logging.Logger;

public class Light {

	Logger log = Logger.getLogger(org.samagra.behavioural.command.Light.class.getName());
	
	boolean isOn;
	
	public  void on() {
		isOn =true;
		log.info("Light switched on");
	}
	
	public void off() {
		isOn = false;
		log.info("Light switched off");
	}

	public boolean isOn() {
		return isOn;
	}
	
}
