package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connexion {
	public Connection cn = null;
	public static Connection connexionDB() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaWs","root","");
			System.out.println("connexion reussite");
			return cn;
		} catch (ClassNotFoundException  | SQLException e) {
			System.out.println("connexion echouee");
			e.printStackTrace();
			return null;
		}
		
	}

}
