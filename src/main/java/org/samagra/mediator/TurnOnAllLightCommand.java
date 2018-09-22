package org.samagra.mediator;

public class TurnOnAllLightCommand implements Command {

	Mediator mediator;
	
	 
	
	public TurnOnAllLightCommand(Mediator mediator) {
		super();
		this.mediator = mediator;
	}


	@Override
	public void execute() {
		mediator.turnOnAllLights();
	}

}
