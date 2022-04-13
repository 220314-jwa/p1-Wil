package net.revature.services;

import java.util.Set;

import net.revature.data.PersonDAO;
import net.revature.data.StoryDAO;
import net.revature.exceptions.IncorrectCredentialsException;
import net.revature.exceptions.UserNameAlreadyExistsException;
import net.revature.implementations.PersonDAOImpl;
import net.revature.implementations.StoryDAOImpl;
import net.revature.models.Person;
import net.revature.models.Story;

public class UserServiceImpl implements UserService {
	private PersonDAO personDAO= new PersonDAOImpl();
	private StoryDAO storyDAO= new StoryDAOImpl();

	@Override
	public Person register(Person newUser) throws UserNameAlreadyExistsException {
	    int newId=personDAO.create(newUser);
	    if (newId>0) {
	    	newUser.setId(newId);
	    	return newUser;
	    }else if ( newId==-1) {
	    	throw new UserNameAlreadyExistsException();
	    }
		return null;
	}
	@Override
	public Person login(String username, String password) throws IncorrectCredentialsException {
		Person personFromDatabase=personDAO.getByUsername(username);
		if(personFromDatabase != null && personFromDatabase.getPassword().equals(password)){
			return personFromDatabase;
			
		}else {
			throw new IncorrectCredentialsException();
		}
	}
	@Override
	public Person updateUser(Person userToUpdate) {
		if (personDAO.getUserById(userToUpdate.getId())!= null) {
			personDAO.update(userToUpdate);
			userToUpdate=personDAO.getId();
			return userToUpdate;
		}
		return null;
	}
	@Override
	public Person getUserById(int id) {
	
		return personDAO.getUserById(id);
	}
	@Override
	public int submitAStory(Story newStory) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Set<Story> viewSubmittedStories(String title) {
		// TODO Auto-generated method stub
		return null;
	}
	public StoryDAO getStoryDAO() {
		return storyDAO;
	}
	public void setStoryDAO(StoryDAO storyDAO) {
		this.storyDAO = storyDAO;
	}

	//@Override
//	public Person updateUser(Person userToUpdate) {
//		if ( personDAO.getById(userToUpdate.getId())!=null) {
//			personDAO.update(userToUpdate);
//			userToUpdate=personDAO.getById(userToUpdate.getId());
//			return userToUpdate;
//		}
//		
//		return null;
//	}






}
