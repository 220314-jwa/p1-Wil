package net.revature.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionFactory {

		private static Connection connection = null; 
		
		public static Connection getConnection() {
			
			if (connection==null) {
				
				try {
					ResourceBundle bundle= ResourceBundle.getBundle("dbConfig");
					String url=bundle.getString("url");
					String username=bundle.getString("username") ;
					String password=bundle.getString("password"); 
					connection=DriverManager.getConnection(url, username, password);
					
				}catch ( SQLException e) {
					e.printStackTrace();
				}
			}
		
			return connection;
			
	}

}
