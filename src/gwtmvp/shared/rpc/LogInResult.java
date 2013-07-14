package gwtmvp.shared.rpc;

import gwtmvp.shared.dto.CurrentUserDto;

import com.gwtplatform.dispatch.shared.Result;

public class LogInResult implements Result {

	private static final long serialVersionUID = 1L;

	private CurrentUserDto currentUser;

	LogInResult() {
	}

	public LogInResult(CurrentUserDto currentUser) {
		this.currentUser = currentUser;
	}

	public CurrentUserDto getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(CurrentUserDto currentUser) {
		this.currentUser = currentUser;
	}
}
