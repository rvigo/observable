package br.com.observers;

import br.com.subject.Subject;

public class NameObserver implements Observer {

	private Subject subject;

	public NameObserver(Subject subject) {
		this.subject = subject;
		this.subject.registerObserver(this);
	}

	public void update() {
		System.out.println(subject.getState() + " is now observed");

	}
}
