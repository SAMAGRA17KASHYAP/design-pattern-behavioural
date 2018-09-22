package org.samagra.behavioural.iterator;

public class CyclistDemo {
	public static void main(String[] args) {
		CylistList list = new CylistList();
		list.insert("SAM1");
		list.insert("KSH1");
		list.insert("SAM2");
		list.insert("KSH2");
		list.insert("SAM3");
		
		for(String name :list) {
			System.out.println(name);
		}
		System.out.println();
		
		
	}
}
