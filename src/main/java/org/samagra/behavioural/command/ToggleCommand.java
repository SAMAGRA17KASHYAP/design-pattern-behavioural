package org.samagra.behavioural.command;

public class ToggleCommand implements Command {

	Light light;

	public ToggleCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		if (light.isOn())
			light.off();
		else
			light.on();
	}

}
