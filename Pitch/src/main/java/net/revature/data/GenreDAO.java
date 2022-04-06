package net.revature.data;

import net.revature.models.Genre;

public interface GenreDAO extends GenericDAO <Genre> {
	
public int getById(int id); 
}
