package net.revature.services;

import net.revature.models.Story;

public interface EditorService {

	public Story reviewStory(Story storyToReview);
	public Story getStoryById(int id);
	
	//public approved Story
	//public rejected
}
