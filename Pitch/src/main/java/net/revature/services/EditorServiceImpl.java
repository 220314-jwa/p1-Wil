package net.revature.services;

import net.revature.data.StoryDAO;
import net.revature.implementations.StoryDAOImpl;
import net.revature.models.Story;

public class EditorServiceImpl implements EditorService{
	private StoryDAO storyDAO= new StoryDAOImpl();

	@Override
	public Story reviewStory(Story storyToReview) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getStoryById(int id) {
		// TODO Auto-generated method stub
		return storyDAO.getById(id);
	}

	public StoryDAO getStoryDAO() {
		return storyDAO;
	}

	public void setStoryDAO(StoryDAO storyDAO) {
		this.storyDAO = storyDAO;
	}

}
	
