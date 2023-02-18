package in.codegram.sms.daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.codegram.sms.dao.ScheduleDAO;
import in.codegram.sms.domain.Schedule;
import in.codegram.sms.util.DBUtil;

public class ScheduleDAOImpl extends DBUtil implements ScheduleDAO {

	@Override
	public void save(Schedule schedule) {
		String sql = "insert into schedules(trainerName,technologyName,date,batchTime) values(?,?,?,?)";
			PreparedStatement pst =	preStatement(sql);
				try {
					pst.setString(1, schedule.getTrainerName());
					pst.setString(2, schedule.getTechnologyName());
					pst.setString(3, schedule.getDate());
					pst.setString(4, schedule.getBatchTime());
					pst.execute();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				
				closeResource();
				
	}

	@Override
	public List<Schedule> findAll() {
		String sql="select * from schedules";
	PreparedStatement pst =	preStatement(sql);
	List<Schedule> schedules = new ArrayList<>();
	Schedule schedule;
	try {
		ResultSet rs =	pst.executeQuery();
		while(rs.next()) {
			schedule = new Schedule();
			schedule.setId(rs.getInt("id"));
			schedule.setTrainerName(rs.getString("trainerName"));
			schedule.setTechnologyName(rs.getString("technologyName"));
			schedule.setDate(rs.getString("date"));
			schedule.setBatchTime(rs.getString("batchTime"));
			schedules.add(schedule);
		}
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
	
	closeResource();
		return schedules;
	}

	@Override
	public void delete(int id) {
		String sql="delete from schedules where id=?";
	PreparedStatement pst =	preStatement(sql);
	try {
		pst.setInt(1, id);
		pst.execute();
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
	
		

	}

	@Override
	public void update(Schedule schedule) {
		String sql="update schedules SET trainerName=?, technologyName=?, date=? where id=?";
	PreparedStatement pst =	preStatement(sql);
			try {
				pst.setString(1, schedule.getTrainerName());
				pst.setString(2, schedule.getTechnologyName());
				pst.setString(3, schedule.getDate());
				pst.setInt(4, schedule.getId());
				pst.executeUpdate();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			
			closeResource();
			

	}

}
