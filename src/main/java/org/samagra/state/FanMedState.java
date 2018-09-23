package org.samagra.state;

public class FanMedState extends State {
	Fan fan;

	public FanMedState(Fan fan) {
		super();
		this.fan = fan;
	}
	
	@Override
	public void handleRequest() {
		log.info("Turning fan from med to high state");
		fan.setState(fan.getFanHightState());
	}
}
