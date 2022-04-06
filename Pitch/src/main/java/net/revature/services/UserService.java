package net.revature.services;

import java.util.Set;

import net.revature.exceptions.IncorrectCredentialsException;
import net.revature.exceptions.UserNameAlreadyExistsException;
import net.revature.models.Person;
import net.revature.models.Story;

public interface UserService {

		// Let's set up the business logic, all the things a user:author or editor can do here.
		
		public Person register(Person newUser) throws UserNameAlreadyExistsException;
		public Person login(String username, String password) throws IncorrectCredentialsException;
		public Person updateUser(Person userToUpdate);
		public Person getUserById(int id);
		public int submitAStory(Story newStory);
		public Set <Story> viewSubmittedStories (String title);
		
		
	
		
	


}
