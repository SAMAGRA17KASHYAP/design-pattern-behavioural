package org.samagra.mediator;

public class Main {

	public static void main(String []argv) {
		
		Light kitchenLight = new Light("Kitchen");
		Light bedroomLight = new Light("bedroom");
		
		Mediator mediator = new Mediator();
		mediator.registerLight(bedroomLight);
		mediator.registerLight(kitchenLight);
		
		Command turnAllLight = new TurnOnAllLightCommand(mediator);
		turnAllLight.execute();
		
		Command turnOffAllLight = new TurnOffAllLightCommand(mediator);
		turnOffAllLight.execute();
		
		
	}
	
}
