package org.samagra.behavioural.chainofresponsibility;

public class VP extends Handler {

	@Override
	void handleRequest(Request request) {
		if(request.getRequestType() == RequestType.PURCHASE && request.getExpense() <= 1500)
			System.out.println("VP handled the request "+ request);
		else
			successor.handleRequest(request);
	}

}
