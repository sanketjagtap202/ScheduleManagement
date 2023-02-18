package in.codegram.sms.util;

/**
 * Creating a DB connectivity, preparedStatement, closing resources.
 * @author USER
 *
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBUtil {
//DB Info:

	String url = "jdbc:mysql://localhost/smsdb";
	String user = "root";
	String password = "admin";
	String myDriver = "com.mysql.cj.jdbc.Driver";

	// Create connection:
	private Connection conn = null;

	private Connection connect() {
		try {
			Class c = Class.forName(myDriver);
			conn = DriverManager.getConnection(url, user, password);

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}

		return conn;
	}

	// Create preparedStatement:

	public PreparedStatement ps = null;

	public PreparedStatement preStatement(String sql) {

		try {
			ps = connect().prepareStatement(sql);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return ps;

	}
	
	// Close resources;
	
	public void closeResource() {
		
		try {
			ps.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
