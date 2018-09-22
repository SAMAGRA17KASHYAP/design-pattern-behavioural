package org.samagra.mediator;

public class TurnOffAllLightCommand implements Command {
	Mediator mediator;

	public TurnOffAllLightCommand(Mediator mediator) {
		super();
		this.mediator = mediator;
	}

	@Override
	public void execute() {
		mediator.turnOffAllLights();
	}
}
