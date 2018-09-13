package org.samagra.behavioural.command;

public class OnCommand implements Command {

	Light light;
	
	public OnCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}

}
