package net.revature.pitch;

import net.revature.data.DAOFactory;
import net.revature.data.PersonDAO;
import net.revature.data.StoryDAO;
import net.revature.models.Person;
import net.revature.models.Story;
import net.revature.services.UserService;
import io.javalin.Javalin;
import io.javalin.http.HttpCode;

public class PitchYaPro {

	private static UserService userService;

	public static void main(String[] args) {

		Javalin app = Javalin.create().start(8081);
	
		
//		app.post("/person", ctx -> {
//
//			Person person = ctx.bodyAsClass(net.revature.models.Person.class);
//
//			PersonDAO personDAO = DAOFactory.getPersonDAO();
//
//			int id = personDAO.create(person);
//
//			ctx.result("the person id is " + id);
//
//		});
		
		
		app.post("/story", ctx -> {

			Story story = ctx.bodyAsClass(net.revature.models.Story.class);

			StoryDAO storyDAO = DAOFactory.getStoryDAO();

			int id = storyDAO.create(story);

			ctx.result("the story id is " + id);

		});
		
		
		app.get("/story/{id}", ctx -> {
		int id = Integer.parseInt(ctx.pathParam("id"));
			StoryDAO storyDAO = DAOFactory.getStoryDAO();
			int resultStory = storyDAO.getById(id);
			ctx.json(resultStory);

		});
		
		
		
		// Getting all the users:both authors and editors
//		app.get("/person/{id}", ctx -> {
//			int id = Integer.parseInt(ctx.pathParam("id"));
//			PersonDAO personDAO = DAOFactory.getPersonDAO();
//			Person resultPerson = personDAO.getUserById(id);
//			ctx.json(resultPerson);
//
//		});
		
//		//deleting users
//		app.delete("/person/{id}", ctx->{
//				int deleteId=Integer.parseInt(ctx.queryParam("id"));
//				PersonDAO personDAO= DAOFactory.getPersonDAO();
//				personDAO.deleteById(deleteId);*/
//				
//	}); 
		
		 
		// update users
//		app.put("/person", ctx -> {
//			//int userId=Integer.parseInt(ctx.pathParam("id"));
//			//System.out.println(userId);
//			Person person = ctx.bodyAsClass(net.revature.models.Person.class);
//			PersonDAO personDAO = DAOFactory.getPersonDAO();
//			//System.out.println(personDAO.getUserById(userId));
//			personDAO.update(person);
//			ctx.json(person);
//
//		});

	}
}