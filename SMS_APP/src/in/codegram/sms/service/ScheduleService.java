package in.codegram.sms.service;

import java.util.List;

import in.codegram.sms.domain.Schedule;

/**
 * We will write here the business for the program
 * @author USER
 *
 */
public interface ScheduleService {
	
	void insertSchedule(Schedule schedule);
	
	List<Schedule> showAllSchedule();
	
	void removeSchedule(int id);
	
	void editSchedule(Schedule schedule);
	
	
}
