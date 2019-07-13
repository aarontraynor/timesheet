package model;

import java.util.Date;

/**
 * 
 * @author Aaron
 *
 */
public class Shift {
	private Employer employer;
	private Date startDateTime;
	private Date endDateTime;
	private int breakDuration;
	
	/**
	 * 
	 * @param employer
	 * @param startDateTime
	 * @param endDateTime
	 */
	public Shift(Employer employer, Date startDateTime, Date endDateTime) {
		init(employer, startDateTime, endDateTime, 0);
	}
	
	/**
	 * 
	 * @param employer
	 * @param startDateTime
	 * @param endDateTime
	 * @param breakDuration
	 */
	public Shift(Employer employer, Date startDateTime, Date endDateTime, int breakDuration) {
		init(employer, startDateTime, endDateTime, breakDuration);
	}
	
	private void init(Employer employer, Date startDateTime, Date endDateTime, int breakDuration) {
		this.employer = employer;
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
		this.breakDuration = breakDuration;
	}
}
