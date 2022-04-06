package net.revature.data;

import net.revature.models.Story;

public interface StoryDAO extends GenericDAO<Story> {
	
public Story getByTitle(String title);

}
