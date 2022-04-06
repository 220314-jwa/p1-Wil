package net.revature.implementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;

import net.revature.data.GenreDAO;
import net.revature.models.Genre;
import net.revature.services.ConnectionFactory;



public class GenreDAOImpl implements GenreDAO {
	
	//Connection object, used to connect to the database
	Connection connection; 
	
	
	//Constructor, retrieve/get a connection from the connection Factory
	public GenreDAOImpl() {
		
		//Calling the method we made in connection factory
		
		connection=ConnectionFactory.getConnection();
	}

	@Override
	public int create(Genre dataToAdd) {
		String sql= "insert into genre id, genre_id, genre name  values (default, genre_id, genre_name";
		
		try {
			PreparedStatement preparedStatement= connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			preparedStatement.setLong(1,dataToAdd.getGenre_id());
			preparedStatement.setString(2, dataToAdd.getGenre_name());
			
			int count= preparedStatement.executeUpdate();
					
			ResultSet resultSet = preparedStatement.getGeneratedKeys();
			if (count > 0) {
				System.out.println("One genre is added to the database");

				resultSet.next();
				int id = resultSet.getInt(1);

				return id;
			} else {

				System.out.println("Something is wrong when trying to add a genre to the database");
				return -1;
			}

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}

	@Override
	public Set<Genre> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Genre dataToUpdate) {
		// TODO Auto-generated method stub
		
	}

	@Override	public void delete(Genre dataToDelete) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getById(int id) {
		// TODO Auto-generated method stub
		return 0;
	}


}
