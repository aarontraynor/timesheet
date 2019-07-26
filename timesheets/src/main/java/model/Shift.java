package model;

import java.sql.Date;
import java.sql.Time;

/**
 * 
 * @author Aaron
 *
 */
public class Shift {
	private int id;
	private int employerID;
	private Date startDate;
	private Date endDate;
	private Time startTime;
	private Time endTime;
	private int breakDuration;

	public Shift(int employerID, Date startDate, Date endDate, Time startTime, Time endTime) {
		init(employerID, startDate, endDate, startTime, endTime, 0);
	}

	public Shift(int employerID, Date startDate, Date endDate, Time startTime, Time endTime, int breakDuration) {
		init(employerID, startDate, endDate, startTime, endTime, breakDuration);
	}
	
	private void init(int employerID, Date startDate, Date endDate, Time startTime, Time endTime, int breakDuration) {
		this.employerID = employerID;
		this.startDate = startDate;
		this.endDate = endDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.breakDuration = breakDuration;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String[] getDataAsArray() {
		String[] ret = {startDate.toString(), startTime.toString(), endDate.toString(), endTime.toString(), "0"};
		return ret;
	}
}
