package org.samagra.behavioural.chainofresponsibility;

public class CEO extends Handler{

	@Override
	void handleRequest(Request request) {
		System.out.println("CEO handled the request::"+ request);
	}

}
