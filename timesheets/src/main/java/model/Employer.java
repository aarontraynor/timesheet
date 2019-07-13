package model;

/**
 * 
 * @author Aaron
 *
 */
public class Employer {
	private String companyName;
	private double hourlyRate;
	
	/**
	 * 
	 * @param companyName
	 * @param hourlyRate
	 */
	public Employer(String companyName, double hourlyRate) {
		this.companyName = companyName;
		this.hourlyRate = hourlyRate;
	}
}
