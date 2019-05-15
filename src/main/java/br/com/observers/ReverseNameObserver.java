package br.com.observers;

import br.com.subject.Subject;

public class ReverseNameObserver implements Observer {
	private Subject subject;

	public ReverseNameObserver(Subject subject) {
		this.subject = subject;
		this.subject.registerObserver(this);
	}

	@Override
	public void update() {
		System.out.printf("The reversed state is \"%s\"\n", new StringBuilder(subject.getState()).reverse().toString());
	}

}
