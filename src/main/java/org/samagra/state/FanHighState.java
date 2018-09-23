package org.samagra.state;

public class FanHighState extends State {
	Fan fan;

	public FanHighState(Fan fan) {
		super();
		this.fan = fan;
	}
	
	@Override
	public void handleRequest() {
		log.info("Turning fan from high to off state");
		fan.setState(fan.getFanOffState());
	}
}
