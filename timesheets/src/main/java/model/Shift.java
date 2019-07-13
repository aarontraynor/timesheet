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
	 * @param employer the employer paying for the shift
	 * @param startDateTime the date and time that the shift started
	 * @param endDateTime the date and time that the shift ended
	 */
	public Shift(Employer employer, Date startDateTime, Date endDateTime) {
		init(employer, startDateTime, endDateTime, 0);
	}
	
	/**
	 *
	 * @param employer the employer paying for the shift
	 * @param startDateTime the date and time that the shift started
	 * @param endDateTime the date and time that the shift ended
	 * @param breakDuration the length (in minutes) of any breaks during the shift
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
