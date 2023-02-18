package in.codegram.sms.test;

import java.util.List;

import in.codegram.sms.dao.ScheduleDAO;
import in.codegram.sms.daoimpl.ScheduleDAOImpl;
import in.codegram.sms.domain.Schedule;

public class ScheduleDAOImplFindOperationTest {

	public static void main(String[] args) {

		ScheduleDAO scheduledao = new ScheduleDAOImpl();

		List<Schedule> schedules = scheduledao.findAll();
	
		for (Schedule schedule : schedules) {
			System.out.println(schedule);
		}
	}

}
