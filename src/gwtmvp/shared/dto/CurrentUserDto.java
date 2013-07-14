package gwtmvp.shared.dto;

public class CurrentUserDto implements Dto {

	private static final long serialVersionUID = 1L;

	private String name;
	private Boolean loggedIn;

	public CurrentUserDto() {
		name = null;
		loggedIn = false;
	}

	public CurrentUserDto(String name, Boolean loggedIn) {
		this.name = name;
		this.loggedIn = loggedIn;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean isLoggedIn() {
		return loggedIn;
	}
	public void setLoggedIn(Boolean loggedIn) {
		this.loggedIn = loggedIn;
	}


}
