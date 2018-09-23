package org.samagra.state;

public class FanLowState extends State {
	Fan fan;

	public FanLowState(Fan fan) {
		super();
		this.fan = fan;
	}
	
	@Override
	public void handleRequest() {
		log.info("Turning fan from low to med state");
		fan.setState(fan.getFanMedState());
	}
}
