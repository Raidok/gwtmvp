package gwtmvp.shared.rpc;

import com.gwtplatform.dispatch.shared.UnsecuredActionImpl;

public class SendGreeting extends UnsecuredActionImpl<SendGreetingResult> {

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
