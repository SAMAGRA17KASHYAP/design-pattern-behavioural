package org.samagra.state;

import java.util.logging.Logger;

public abstract class State {

	protected static final Logger log = Logger.getLogger(State.class.getName());
	
	public void handleRequest() {
		log.info("You should not come here");
	}
	
}
