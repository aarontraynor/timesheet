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
	 * @param companyName the Employer's company name
	 * @param hourlyRate the hourly rate of the Employer
	 */
	public Employer(String companyName, double hourlyRate) {
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
}
