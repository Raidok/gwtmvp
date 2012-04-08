package gwtmvp.shared.event;

import com.google.gwt.event.shared.GwtEvent;

public class GreetingSentEvent extends GwtEvent<GreetingSentEventHandler> {
	public static Type TYPE = new Type();

	private final String name;
	private final String message;

	public GreetingSentEvent(final String name, final String message) {
		this.name = name;
		this.message = message;
	}

	public String getName() {
		return name;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public Type getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(GreetingSentEventHandler handler) {
		handler.onGreetingSent(this);
	}

}
