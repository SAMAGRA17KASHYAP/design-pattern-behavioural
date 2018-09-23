package org.samagra.state;

public class Fan {

	State fanOffState;
	State fanLowState;
	State fanMedState;
	State fanHightState;

	State state;

	public Fan() {
		super();
		fanOffState = new FanOffState(this);
		fanLowState = new FanLowState(this);
		fanMedState = new FanMedState(this);
		fanHightState = new FanHighState(this);
		state = fanOffState;
	}

	public void pullChain() {
		state.handleRequest();
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getFanOffState() {
		return fanOffState;
	}

	public State getFanLowState() {
		return fanLowState;
	}

	public State getFanMedState() {
		return fanMedState;
	}

	public State getFanHightState() {
		return fanHightState;
	}

	@Override
	public String toString() {
		return "Fan [state=" + state + "]";
	}

}
