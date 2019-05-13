package br.com.observers;

import br.com.subject.Subject;

public class NameObserver implements Observer {

	private String name;
	private Subject subject;

	public NameObserver(Subject subject) {
		this.subject = subject;
		this.subject.registerObserver(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public NameObserver(String name) {
		this.name = name;
	}

	public void update() {
		System.out.println(subject.getState() + " is now observed");
	}

}
