package org.samagra.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

	private List<Observer> observers = new ArrayList<>();
		
	abstract void  setState(String state);
	
	abstract String getState();
	
	public void attachObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void notifyObservers() {
		for(Observer observer:observers) {
			observer.update();	
		}
	}
	
}
