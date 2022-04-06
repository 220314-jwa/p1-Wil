package net.revature.data;

import java.util.Set;

import net.revature.models.Person;

/*The DAO, which stands for Data Access Object is an object 
 * created specifically for accessing data, particularly
 * data in a database. The D generic stands for the type of data
 * you are working with be it users, stories....
 * 
 * Now why are we using Generics? Two reasons: flexibility and safety.
 * Flexibility: it allows us to specify  the type of object you would in your code 
 * once the type is specified, it is set in stone. It cannot be changed. 
 * 
 * Safety: Generics provide compile-time  type safety, meaning that only the object
 * you have specified will be allowed by the compiler. For example if you specify an  object
 * Cat in  your code and you mistakenly add a dog, the compiler will throw an error. 
 * 
 * */
public interface GenericDAO<D>{
		
		public int create( D dataToAdd);
		public int getById(int id);
		public Set<D> getAll();
		public void update (D dataToUpdate);
		public void delete ( D dataToDelete);
	}


