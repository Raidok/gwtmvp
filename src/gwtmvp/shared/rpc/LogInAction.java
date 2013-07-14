package gwtmvp.shared.rpc;

import com.gwtplatform.dispatch.shared.UnsecuredActionImpl;

public class LogInAction extends UnsecuredActionImpl<LogInResult> {

	private String email;
	private String password;

	LogInAction() {
	}
	
	public LogInAction(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
