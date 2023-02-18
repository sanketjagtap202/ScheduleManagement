package in.codegram.sms.dao;

import java.util.List;

import in.codegram.sms.domain.Schedule;

public interface ScheduleDAO {

	void save(Schedule schedule);
	
	List<Schedule> findAll();
	
	void delete(int id);
	
	void update(Schedule schedule);
	
}
