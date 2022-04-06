package net.revature.pitch;

import net.revature.data.DAOFactory;
import net.revature.data.PersonDAO;
import net.revature.models.Person;
import net.revature.services.UserService;
import io.javalin.Javalin;
import io.javalin.http.HttpCode;

public class PitchYaPro {

	private static UserService userService;

	public static void main(String[] args) {

		Javalin app = Javalin.create().start(8090);
		app.post("/person", ctx -> {

			Person person = ctx.bodyAsClass(net.revature.models.Person.class);

			PersonDAO personDAO = DAOFactory.getPersonDAO();

			int id = personDAO.create(person);

			ctx.result("the user id is " + id);

		});
		// Getting all the users:both authors and editors
		app.get("/person/{id}", ctx -> {
			int id = Integer.parseInt(ctx.pathParam("id"));
			PersonDAO personDAO = DAOFactory.getPersonDAO();
			Person resultPerson = personDAO.getUserById(id);
			ctx.json(resultPerson);

		});
		
//		//deleting users
//		app.delete("/person/{id}", ctx->{
//				int deleteId=Integer.parseInt(ctx.queryParam("id"));
//				PersonDAO personDAO= DAOFactory.getPersonDAO();
//				personDAO.deleteById(deleteId);*/
//				
//	}); 
		
		 
		// update users
		app.put("/person", ctx -> {
			Person person = ctx.bodyAsClass(net.revature.models.Person.class);
			PersonDAO personDAO = DAOFactory.getPersonDAO();
			personDAO.update(person);

		});

	}
}