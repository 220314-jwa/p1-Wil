package net.revature.services;

import net.revature.data.StoryDAO;
import net.revature.implementations.StoryDAOImpl;
import net.revature.models.Story;

public class EditorServiceImpl implements EditorService{
	private StoryDAO storyDAO= new StoryDAOImpl();

	@Override
	public Story reviewStory(Story storyToReview) {
		Story storyFromDatabase= storyDAO.getByTitle(storyToReview.getTitle());
		if(storyFromDatabase != null ) {
			storyDAO.update(storyToReview);
			return storyDAO.getByTitle(storyToReview.getTitle());
			
		}
		
		return null;
	}

	@Override
	public Story getStoryById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
	
