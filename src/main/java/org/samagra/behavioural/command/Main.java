package org.samagra.behavioural.command;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class Main {

	static Logger log = Logger.getLogger(org.samagra.behavioural.command.Main.class.getName());
	
	public static void main(String[] args) {
		
		Light light = new Light();
		List<Light> listOfLights = listOfLights();
		
		Command onCommand = new OnCommand(light);
		Command macroCommand = new MacroOnAllCommand(listOfLights);
		
		
		Command toggleCommand = new ToggleCommand(light);
		
		Switch swith = new Switch();
		swith.storeAndExecute(onCommand);
		swith.storeAndExecute(toggleCommand);
		swith.storeAndExecute(toggleCommand);
		swith.storeAndExecute(toggleCommand);
		swith.storeAndExecute(toggleCommand);
		swith.storeAndExecute(toggleCommand);
		swith.storeAndExecute(toggleCommand);
		swith.storeAndExecute(toggleCommand);
		log.info("Main.main()");
		swith.storeAndExecute(macroCommand);
		
	}

	private static List<Light> listOfLights() {
		Light light1 = new Light();
		Light light2 = new Light();
		Light light3 = new Light();
		return Arrays.asList(light1,light2,light3);
	}
	
}
