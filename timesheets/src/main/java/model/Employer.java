package model;

/**
 * 
 * @author Aaron
 *
 */
public class Employer {
	private int id;
	private String companyName;
	private double hourlyRate;

	/**
	 *
	 * @param id the company's unique ID as found in the database
	 * @param companyName the Employer's company name
	 * @param hourlyRate the hourly rate of the Employer
	 */
	public Employer(int id, String companyName, double hourlyRate) {
		this.id = id;
		this.companyName = companyName;
		this.hourlyRate = hourlyRate;
	}

	/**
	 *
	 * @return the Employer's company name
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 *
	 * @param name the new company name of the Employer
	 */
	public void setCompanyName(String name) {
		this.companyName = name;
	}

	/**
	 *
	 * @return the current hourly rate from the Employer
	 */
	public double getHourlyRate() {
		return hourlyRate;
	}

	/**
	 *
	 * @param hourlyRate the new hourly rate from the Employer
	 */
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	@Override
	public String toString() {
		return this.companyName;
	}
}
