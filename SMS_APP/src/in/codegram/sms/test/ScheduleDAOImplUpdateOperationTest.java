package in.codegram.sms.test;

import java.util.List;

import in.codegram.sms.dao.ScheduleDAO;
import in.codegram.sms.daoimpl.ScheduleDAOImpl;
import in.codegram.sms.domain.Schedule;

public class ScheduleDAOImplUpdateOperationTest {

	public static void main(String[] args) {

		ScheduleDAO scheduledao = new ScheduleDAOImpl();
		Schedule schedule = new Schedule();
		schedule.setId(2);
		schedule.setTrainerName("Ashish Lahoti");
		schedule.setTechnologyName("FullStack");
		schedule.setDate("2nd March 2023");
		scheduledao.update(schedule);
		System.out.println("Updated Successfully!!");

	}

}
