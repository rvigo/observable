package br.com.subject;

import java.util.ArrayList;
import java.util.List;

import br.com.observers.Observer;

public class Subject {
	private List<Observer> observers;

	private String state;

	public Subject(String state) {
		observers = new ArrayList<Observer>();
		setState(state);
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		System.out.println("the state has been updated to " + this.getState());

		notifyObservers();
	}

	public void notifyObservers() {
		for (Observer o : observers)
			o.update();
	}

	public void registerObserver(Observer... observers) {
		for (Observer o : observers)
			this.observers.add(o);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
}
