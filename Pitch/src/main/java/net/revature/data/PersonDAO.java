package net.revature.data;

import net.revature.models.Person;

public interface PersonDAO extends GenericDAO <Person> {
	public Person getByUsername(String  username);

	public Person getId();

	public Person getUserById(int id);
	
	public int getById(int id);

	public void deleteById(int deleteId);

}
