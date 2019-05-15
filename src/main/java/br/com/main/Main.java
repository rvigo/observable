package br.com.main;

import java.util.List;
import java.util.Observer;

import br.com.observers.NameObserver;
import br.com.observers.ReverseNameObserver;
import br.com.subject.Subject;

public class Main {

	List<Observer> observers;

	public static void main(String[] args) {
		String firstState = "first state";
		String secondState = "second state";

		Subject sub = new Subject(firstState);
		NameObserver nameObserver = new NameObserver(sub);
		ReverseNameObserver reverseObserver = new ReverseNameObserver(sub);
		sub.notifyObservers();

		sub.setState(secondState);

		sub.removeObserver(reverseObserver);
		System.out.println("reverseObserver removed");

		sub.notifyObservers();

		sub.removeObserver(nameObserver);
		System.out.println("nameObserver removed");

		sub.notifyObservers();
	}
}
