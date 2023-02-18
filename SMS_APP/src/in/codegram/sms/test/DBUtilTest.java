package in.codegram.sms.test;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.codegram.sms.util.DBUtil;

public class DBUtilTest {

	public static void main(String[] args) {
		
	DBUtil dbutil =	new DBUtil();
	String sql="insert into schedules(trainerName,technologyName,date,batchTime) values(?,?,?,?)";
	
	  PreparedStatement pst =  dbutil.preStatement(sql);
		try {
			pst.setString(1, "ABC");
			pst.setString(2, "Java");
			pst.setString(3, "25th feb 2023");
			pst.setString(4, "12pm to 4pm");
			pst.execute();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		dbutil.closeResource();
		
	}

}
