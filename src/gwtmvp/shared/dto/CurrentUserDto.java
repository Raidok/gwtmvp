package gwtmvp.shared.dto;

public class CurrentUserDto implements Dto {

	private static final long serialVersionUID = 1L;

	private String name;
	private String email;
	private Boolean loggedIn;

	public CurrentUserDto() {
		name = null;
		loggedIn = false;
	}

	public CurrentUserDto(String name, String email, Boolean loggedIn) {
		this.name = name;
		this.email = email;
		this.loggedIn = loggedIn;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Boolean isLoggedIn() {
		return loggedIn;
	}
	public void setLoggedIn(Boolean loggedIn) {
		this.loggedIn = loggedIn;
	}
	public void copyFrom(CurrentUserDto currentUser) {
		name = currentUser.getName();
		email = currentUser.getEmail();
		loggedIn = currentUser.isLoggedIn();
	}

}
