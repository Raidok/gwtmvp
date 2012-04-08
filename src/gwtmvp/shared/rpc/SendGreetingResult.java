package gwtmvp.shared.rpc;

import net.customware.gwt.dispatch.shared.Result;

public class SendGreetingResult implements Result {

	private String name;
	private String message;

	SendGreetingResult() {
	}

	public SendGreetingResult(final String name, final String message) {
		this.name = name;
		this.message = message;
	}

	public String getName() {
		return name;
	}

	public String getMessage() {
		return message;
	}
}
