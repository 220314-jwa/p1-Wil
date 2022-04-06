package net.revature.exceptions;

public class UserNameAlreadyExistsException extends Exception {

	private static final long serialVersionUID = 1712843686624302051L;

	public UserNameAlreadyExistsException() {
		super("Another user has already taken your username");
		// TODO Auto-generated constructor stub
	}
	
}
