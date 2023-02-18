package in.codegram.sms.serviceimpl;

import java.util.List;

import in.codegram.sms.dao.ScheduleDAO;
import in.codegram.sms.daoimpl.ScheduleDAOImpl;
import in.codegram.sms.domain.Schedule;
import in.codegram.sms.service.ScheduleService;

public class ScheduleServiceImpl implements ScheduleService {
	ScheduleDAO scheduledao;

	public ScheduleServiceImpl() {
		scheduledao = new ScheduleDAOImpl();
	}

	@Override
	public void insertSchedule(Schedule schedule) {
		scheduledao.save(schedule);

	}

	@Override
	public List<Schedule> showAllSchedule() {
		
		return scheduledao.findAll();
	}

	@Override
	public void removeSchedule(int id) {
		scheduledao.delete(id);

	}

	@Override
	public void editSchedule(Schedule schedule) {
		scheduledao.update(schedule);

	}

}
