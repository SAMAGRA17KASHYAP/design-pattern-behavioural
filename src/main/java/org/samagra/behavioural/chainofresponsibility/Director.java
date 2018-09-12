package org.samagra.behavioural.chainofresponsibility;

public class Director extends Handler {

	@Override
	public void handleRequest(Request request) {
		if(request.getRequestType() == RequestType.CONFERENCE)
			System.out.println("Director handled request "+ request);
		else
			successor.handleRequest(request);
	}

}
