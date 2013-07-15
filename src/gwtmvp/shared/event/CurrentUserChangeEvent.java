package gwtmvp.shared.event;

import gwtmvp.shared.dto.CurrentUserDto;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HasHandlers;

public class CurrentUserChangeEvent extends 
		GwtEvent<CurrentUserChangeEvent.CurrentUserChangeEventHandler> {

	public interface CurrentUserChangeEventHandler extends EventHandler {
		void onCurrentUserChange(CurrentUserChangeEvent event);
	}

	public static Type<CurrentUserChangeEventHandler> TYPE = new Type<CurrentUserChangeEventHandler>();

	public static void fire(HasHandlers source, CurrentUserDto currentUser) {
		if (TYPE != null) {
			source.fireEvent(new CurrentUserChangeEvent(currentUser));
		}
	}

	public static Type<CurrentUserChangeEventHandler> getType() {
		return TYPE;
	}

	private final CurrentUserDto currentUser;

	public CurrentUserChangeEvent(final CurrentUserDto currentUser) {
		this.currentUser = currentUser;
	}

	@Override
	public Type<CurrentUserChangeEventHandler> getAssociatedType() {
		return TYPE;
	}

	public CurrentUserDto getCurrentUser() {
		return currentUser;
	}

	@Override
	protected void dispatch(CurrentUserChangeEventHandler handler) {
		handler.onCurrentUserChange(this);
	}

}
