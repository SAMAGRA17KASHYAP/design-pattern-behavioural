package org.samagra.state;

public class FanOffState extends State {

	Fan fan;

	public FanOffState(Fan fan) {
		super();
		this.fan = fan;
	}
	
	@Override
	public void handleRequest() {
		log.info("Turning fan from off to low");
		fan.setState(fan.getFanLowState());
	}
	
}
