package gwtmvp.client.security;

import gwtmvp.shared.dto.CurrentUserDto;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.gwtplatform.mvp.client.proxy.Gatekeeper;

@Singleton
//@DefaultGatekeeper // use it if your pages need authorization by default and annotate @NoGatekeeper presenters that are public
public class LoggedInGatekeeper implements Gatekeeper {

	private final CurrentUserDto currentUser;

	@Inject
	public LoggedInGatekeeper(final CurrentUserDto currentUser) {
		this.currentUser = currentUser;
	}

	@Override
	public boolean canReveal() {
		return currentUser.isLoggedIn();
	}

}
