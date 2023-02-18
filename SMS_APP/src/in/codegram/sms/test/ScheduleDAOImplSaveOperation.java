package in.codegram.sms.test;

import in.codegram.sms.dao.ScheduleDAO;
import in.codegram.sms.daoimpl.ScheduleDAOImpl;
import in.codegram.sms.domain.Schedule;

public class ScheduleDAOImplSaveOperation {

	public static void main(String[] args) {

		ScheduleDAO scheduledao = new ScheduleDAOImpl();
			
		Schedule schedule = new Schedule();
		schedule.setTrainerName("Paul Joe");
		schedule.setTechnologyName("React JS");
		schedule.setDate("20th Feb 2023");
		schedule.setBatchTime("3pm to 6pm");
		scheduledao.save(schedule);
		System.out.println("Schedule info Saved.");
	}

}
