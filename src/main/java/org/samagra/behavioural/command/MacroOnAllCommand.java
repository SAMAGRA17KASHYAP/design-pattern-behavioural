package org.samagra.behavioural.command;

import java.util.List;

public class MacroOnAllCommand implements Command {

	List<Light> listOfLights;
	
	public MacroOnAllCommand(List<Light> listOfLights) {
		super();
		this.listOfLights = listOfLights;
	}

	@Override
	public void execute() {
		for(Light light:listOfLights) {
			if(!light.isOn())
				light.on();	
		}
	}

}
