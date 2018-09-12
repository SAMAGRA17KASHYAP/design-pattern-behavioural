package org.samagra.behavioural.chainofresponsibility;

public class Main {
	public static void main(String[] args) {
		Request  request1 = new Request(RequestType.CONFERENCE,15000);
		Request  request2 = new Request(RequestType.PURCHASE,100);
		Request  request3 = new Request(RequestType.PURCHASE,15000);
		
		Handler director = new Director();
		Handler vp = new VP();
		Handler ceo = new CEO();
		
		director.setSuccessor(vp);
		vp.setSuccessor(ceo);
		
		director.handleRequest(request1);
		director.handleRequest(request2);
		director.handleRequest(request3);

		
	}
}
