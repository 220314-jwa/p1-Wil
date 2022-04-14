package net.revature.implementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;

import net.revature.data.StoryDAO;
import net.revature.models.Person;
import net.revature.models.Story;
import net.revature.services.ConnectionFactory;

public class StoryDAOImpl implements StoryDAO {
	
	Connection connection; 
	
	public StoryDAOImpl() {
		connection=ConnectionFactory.getConnection();
	}

	@Override
	public int create(Story dataToAdd) {
		String sql="insert into story(id,author,editor, genre, title, description,storylength)" +
	           "values(default,?,?,?,?,?,?);";
	try {
		PreparedStatement preparedStatement=connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
		preparedStatement.setInt(1,dataToAdd.getId());
		preparedStatement.setString(1,dataToAdd.getAuthor());
		preparedStatement.setString(2,dataToAdd.getEditor());
		preparedStatement.setString(3,dataToAdd.getGenre());
		preparedStatement.setString(4,dataToAdd.getTitle());
		preparedStatement.setString(5,dataToAdd.getDescription());
		preparedStatement.setInt(6,dataToAdd.getStoryLength());
		
		int count= preparedStatement.executeUpdate();
		
		ResultSet resultSet=preparedStatement.getGeneratedKeys();
		
		if(count>0) {
			System.out.println("A story was added to the database");
			resultSet.next();
			int id= resultSet.getInt(1);
			return id; 
			
			} else {
				System.out.println("Something is wrong when trying to add a story to the database");
				return -1;
			}
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return -1; 
	}
	}


	@Override
	public Set<Story> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Story dataToUpdate) {
	
		
	}

	private static Story parseResultSet(ResultSet resultSet) throws SQLException {
		Story story = new Story();
		// do something with the return value
		story.setId(resultSet.getInt(1));
		story.setAuthor(resultSet.getString(2));
		story.setEditor(resultSet.getString(3));
		story.setGenre(resultSet.getString(4));
		story.setTitle(resultSet.getString(5));
		story.setDescription(resultSet.getString(6));
		story.setStoryLength(resultSet.getInt(7));
		return story;
	}

	@Override
	public void delete(Story dataToDelete) {
		String sql = "delete from story where id=?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, dataToDelete.getId());
			int count = preparedStatement.executeUpdate();
			if (count != 1) {
				System.out.println("Something went wrong with the deletion");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

	@Override
	public Story getById(int id) {
		Story story = null;

		String sql = "SELECT * FROM story where id=?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, id);

			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				story = StoryDAOImpl.parseResultSet(resultSet);
				return story;
			} else {
				System.out.println("Something went wrong when querying the user");

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return story;
	}

}
