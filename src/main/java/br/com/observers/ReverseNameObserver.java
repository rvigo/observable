package br.com.observers;

import br.com.subject.Subject;

public class ReverseNameObserver implements Observer {
	private String name;
	private Subject subject;

	public ReverseNameObserver(Subject subject) {
		this.subject = subject;
		this.subject.registerObserver(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ReverseNameObserver(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		System.out.printf("The reversed state is \"%s\"\n", new StringBuilder(subject.getState()).reverse().toString());
	}

}
