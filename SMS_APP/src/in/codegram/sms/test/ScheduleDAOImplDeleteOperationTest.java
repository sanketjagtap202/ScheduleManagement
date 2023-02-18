package in.codegram.sms.test;

import java.util.List;

import in.codegram.sms.dao.ScheduleDAO;
import in.codegram.sms.daoimpl.ScheduleDAOImpl;
import in.codegram.sms.domain.Schedule;

public class ScheduleDAOImplDeleteOperationTest {

	public static void main(String[] args) {

		ScheduleDAO scheduledao = new ScheduleDAOImpl();

		scheduledao.delete(1);
		System.out.println("Deleted success!!");
	}

}
