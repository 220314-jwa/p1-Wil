package net.revature.data;

import net.revature.implementations.PersonDAOImpl;
import net.revature.implementations.StoryDAOImpl;

public class DAOFactory { 
	private static PersonDAO personDAO=null;
	private static StatusDAO statusDAO=null; 
	private static StoryDAO storyDAO=null; 
	
	public static PersonDAO getPersonDAO() {
		if(personDAO==null) {
			personDAO= new PersonDAOImpl();
		}
		return personDAO;
	}
	public static void setPersonDAO(PersonDAO personDAO) {
		DAOFactory.personDAO = personDAO;
	}
	public static StatusDAO getStatusDAO() {
		return statusDAO;
	}
	public static void setStatusDAO(StatusDAO statusDAO) {
		DAOFactory.statusDAO = statusDAO;
	}
	public static StoryDAO getStoryDAO() {
		if(storyDAO==null) {
			storyDAO= new StoryDAOImpl();
		}
		return storyDAO;
	}
	public static void setStoryDAO(StoryDAO storyDAO) {
		DAOFactory.storyDAO = storyDAO;
	}
}
