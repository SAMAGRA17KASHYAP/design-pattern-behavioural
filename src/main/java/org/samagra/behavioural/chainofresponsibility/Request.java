package org.samagra.behavioural.chainofresponsibility;

public class Request {

	private RequestType requestType;
	
	public Request() {
		super();
	}

	public Request(RequestType requestType, int expense) {
		super();
		this.requestType = requestType;
		this.expense = expense;
	}

	private int expense;

	public RequestType getRequestType() {
		return requestType;
	}

	public void setRequestType(RequestType requestType) {
		this.requestType = requestType;
	}

	public int getExpense() {
		return expense;
	}

	public void setExpense(int expense) {
		this.expense = expense;
	}

	@Override
	public String toString() {
		return "Request [requestType=" + requestType + ", expense=" + expense + "]";
	}
	
}
