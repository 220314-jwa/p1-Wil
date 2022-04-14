package net.revature.data;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import org.junit.jupiter.api.Test;

import net.revature.implementations.StoryDAOImpl;
import net.revature.models.Story;

public class StoryDAOTest {
	private StoryDAO storyDAO= new StoryDAOImpl();
	
  @Test
	public void  getByIdWhenIdExists() {
	  //setup
	  int idInput=1;
	  //calling the method we are using.
	  Story idOutput = storyDAO.getById(idInput);
	  //asserting that it did what it was expected to do
	  assertEquals(1,idOutput.getId());
	  
	  }
  
  @Test
	public void getByIdWhenIdDoesNotExist() {
		//Setting up
	  int idInput=-1;
	  //Calling the method we are testing
	  Story storyOutput=storyDAO.getById(idInput);
	  //Asserting that it returned what was expected. 
	  assertNull(storyOutput);
		
	}
  
  @Test
	public void getAll() {
	  Set<Story>givenOutput=storyDAO.getAll();
	  assertNotNull(givenOutput);
   
	  
}
  @Test
	public void addNewStory() {
	  Story newStory= new Story();
	  System.out.println(newStory);
	  
	  int generatedId=storyDAO.create(newStory);
	  assertNotEquals(0,generatedId);
	  System.out.println(generatedId);	
		
	}
}
