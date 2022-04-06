package net.revature.data;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import net.revature.implementations.PersonDAOImpl;
import net.revature.models.Person;

public class PersonDAOTest {
	
private PersonDAO personDAO = new PersonDAOImpl();

@Test
public void getValidPersonById()
{
	String expectedUsername = "dro";
	Person actual = personDAO.getUserById(1);
	assertEquals(expectedUsername, actual.getUsername());
}

@Test
public void testUpdate() {
	Person personUp = personDAO.getUserById(6);
	personUp.setFirst_name("wil");
	personDAO.update(personUp);
	Person person=personDAO.getUserById(6);
	System.out.println(person);
	assertEquals("wil",person.getFirst_name());	
}

@Test
public void testGetIDNoID() {
	Person personOutput= personDAO.getUserById(10000);
	assertNull(personOutput);
}

@Disabled
public void createTest() {
	Person create = new Person();
	create.setUsername("my_username");
	assertNotEquals(0, personDAO.create(create));
}

@Test
public void getByUsernameWhenUsernameExists() {
	// setup
	String usernameInput = "dro";
	// call the method we're testing
	Person personOutput = personDAO.getByUsername(usernameInput);
	// assert that it did what we expected
	assertEquals("dro", personOutput.getUsername());
}

@Test
public void getByUsernameButUsernameDoesNotExist() {
	String usernameInput = "pro";
	Person personOutput = personDAO.getByUsername(usernameInput);
	assertNull(personOutput); // assertEquals(null, personOutput)
}


}

