package in.codegram.sms.util;

import java.util.List;
import java.util.Scanner;

import in.codegram.sms.domain.Schedule;
import in.codegram.sms.service.ScheduleService;
import in.codegram.sms.serviceimpl.ScheduleServiceImpl;

public class ScheduleMenu {

	ScheduleService scheduleservice;

	public ScheduleMenu() {
		scheduleservice = new ScheduleServiceImpl();
	}

	public void start() {
		Scanner sc = new Scanner(System.in);
		String contiChoice;
		do {
			showMenu();
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				createSchedule(sc);
				break;
			case 2:
				showScheduleList();
				break;
			case 3:
				deleteSchedule(sc);
				break;
			case 4:
				Schedule schedule = new Schedule();
				System.out.println("Enter ID to Update Schedule");
				schedule.setId(sc.nextInt());
				sc.nextLine();
				System.out.println("Enter New Trainer Name: ");
				schedule.setTrainerName(sc.nextLine());
				System.out.println("Enter new Technology Name: ");
				schedule.setTechnologyName(sc.nextLine());
				System.out.println("Enter new Date to Start a Batch: ");
				schedule.setDate(sc.nextLine());
				scheduleservice.editSchedule(schedule);
				System.out.println("Schedule Updated Successfully!!!");
				break;
			case 0:
				System.out.println("Thanks!! visit again.");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice. try again.");
				break;
			}
			System.out.println("Want to continue:(yes/no)");
			contiChoice = sc.next();
		} while (contiChoice.equals("yes"));

	}

	private void deleteSchedule(Scanner sc) {
		System.out.println("Enter ID to Delete Schedule");
		scheduleservice.removeSchedule(sc.nextInt());
		System.out.println("Schedule Deleted successfully!!!");
	}

	private void showScheduleList() {
		System.out.println("List of Schedule: ");
		List<Schedule> schedules = scheduleservice.showAllSchedule();
		for (Schedule schedule : schedules) {
			System.out.println(schedule);
		}
	}

	private void createSchedule(Scanner sc) {
		Schedule schedule = new Schedule();
		System.out.println("Add New Schedule Below:");
		sc.nextLine();
		System.out.println("Enter trainer Name: ");
		schedule.setTrainerName(sc.nextLine());
		System.out.println("Enter Technology Name: ");
		schedule.setTechnologyName(sc.nextLine());
		System.out.println("Enter Date of Batch Start: ");
		schedule.setDate(sc.nextLine());
		System.out.println("Enter batch Timing: ");
		schedule.setBatchTime(sc.nextLine());
		scheduleservice.insertSchedule(schedule);
		System.out.println("Schedule added Success!!");
	}

	private void showMenu() {
		System.out.println("_______Menu Details_______");
		System.out.println("1. Add Schedule");
		System.out.println("2. List all Schedule");
		System.out.println("3. Delete Schedule");
		System.out.println("4. Update Schedule");
	}

}
