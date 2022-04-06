package net.revature.data;

import net.revature.implementations.PersonDAOImpl;

public class DAOFactory { 
	private static GenreDAO genreDAO= null; 
	private static PersonDAO personDAO=null;
	private static StatusDAO statusDAO=null; 
	private static StoryDAO storyDAO=null; 
	private static RoleDAO roleDAO=null;
	
	public static GenreDAO getGenreDAO() {
		return genreDAO;
		
	}
	public static void setGenreDAO(GenreDAO genreDAO) {
		DAOFactory.genreDAO = genreDAO;
	}
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
		return storyDAO;
	}
	public static void setStoryDAO(StoryDAO storyDAO) {
		DAOFactory.storyDAO = storyDAO;
	}
	public static RoleDAO getUserDAO() {
		return roleDAO;
	}
	public static void setUserDAO(RoleDAO userDAO) {
		DAOFactory.roleDAO = userDAO;
	} 
	
}
