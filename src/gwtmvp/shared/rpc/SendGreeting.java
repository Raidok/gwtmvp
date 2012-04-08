package gwtmvp.shared.rpc;

import net.customware.gwt.dispatch.shared.Action;

public class SendGreeting implements Action<SendGreetingResult> {

	private String name;

	SendGreeting() {
	}

	public SendGreeting(final String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
