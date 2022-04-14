package net.revature.services;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.Set;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import net.revature.data.PersonDAO;
import net.revature.data.StatusDAO;
import net.revature.data.StoryDAO;
import net.revature.exceptions.IncorrectCredentialsException;
import net.revature.exceptions.UserNameAlreadyExistsException;
import net.revature.models.Person;
import net.revature.models.Story;



//Connecting Mockito to JUnit
@ExtendWith(MockitoExtension.class)



public class UserServiceTest {

	@Mock
	private StoryDAO storyDAO;
	
	@Mock
	private PersonDAO personDAO;
	
	@Mock
	private StatusDAO statusDAO; 
	


//Telling Mockito to override the regular DAOS with our mock DAOs
    @InjectMocks
    private UserService userServ  = new UserServiceImpl();
    
    private static Set<Story>mockSubmittedStories;
    
//    @BeforeAll
//    public static void mockSubmittedStoriesSetUp() {
//    	
//    	for (int i=1; i<=5; i++) {
//    		Story story= new Story();
//    		story.setId(i);
//    		if(i<3)
//    			story.setGenre("comedy");
//    		mockSubmittedStories.add(story);
//    	}
//    }

    @Test
    public void LoginSuccessfully() throws IncorrectCredentialsException {
    	
    	//input setup
    	
   String username="usususu";
   String password="hshsnsnsn";
   
   //setup mocking
   
   Person mockPerson=new Person();
   mockPerson.setUsername(username);
   mockPerson.setPassword(password);
   when (personDAO.getByUsername(username)).thenReturn(mockPerson);
   
   //call the method we are testing
   Person actualPerson= userServ.login(username, password);
   
   //assert the expected behavior/output
   assertEquals(mockPerson,actualPerson);
   
   
}
    
   @Test
    public void loginIncorrectPassword() {
	   //Setting up our input.
    	String username="nombre";
    	String password="hsnansgs";
    	
    	//Setting up our mocking
    	Person mockPerson= new Person();
    	mockPerson.setUsername(username);
    	mockPerson.setPassword("password");
    	when(personDAO.getByUsername(username)).thenReturn(mockPerson);
    	
    	//asserting that we have the correct behavior
    	assertThrows(IncorrectCredentialsException.class, ()->{
    		userServ.login(username, password);
    	});
   }
    	
    	@Test
    	public void loginUsernameDoesNotExist() {
    		//Setting up our inputs
    		String username="nahahsn";
    		String password="hshdndsd";
    		
         when(personDAO.getByUsername(username)).thenReturn(null);
         assertThrows(IncorrectCredentialsException.class, ()->{
        	 userServ.login(username, password);
         });
    	}
    	
    	@Test
    	public void registerPersonSuccessfuly() throws UserNameAlreadyExistsException{
    		Person person = new Person();
    		when(personDAO.create(person)).thenReturn(6);
    		
    		Person actualPerson=userServ.register(person);
    		assertEquals(6, actualPerson.getId());
    		
    	} 
    	
    	@Test
    	public void registrationWentWrong()throws UserNameAlreadyExistsException{
    		Person person = new Person();
    		when (personDAO.create(person)).thenReturn(0);
    		Person actualPerson= userServ.register(person);
    		assertNull(actualPerson);
    	}
    	
    	
    	
    	
    }

