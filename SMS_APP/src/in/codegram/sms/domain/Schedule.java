package in.codegram.sms.domain;

public class Schedule {

	private int id;
	private String trainerName;
	private String technologyName;
	private String date;
	private String batchTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public String getTechnologyName() {
		return technologyName;
	}
	public void setTechnologyName(String technologyName) {
		this.technologyName = technologyName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getBatchTime() {
		return batchTime;
	}
	public void setBatchTime(String batchTime) {
		this.batchTime = batchTime;
	}
	@Override
	public String toString() {
		return "Schedule [id=" + id + ", trainerName=" + trainerName + ", technologyName=" + technologyName + ", date="
				+ date + ", batchTime=" + batchTime + "]";
	}

	
	
}
