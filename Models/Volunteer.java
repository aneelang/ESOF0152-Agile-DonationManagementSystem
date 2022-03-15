package Models;

public class Volunteer extends User {
	
	private String driverStatus;
	private String availability;
	private String experience;
	private String coverLetter;

	public Volunteer(String firstName, String lastName, String emailAddress, String streetAddress, String unitNumber,
			String city, String province, String postalCode, String birthDate, String phoneNumber, String driverStatus,
			String availability, String experience, String coverLetter) {
		super(firstName, lastName, emailAddress, streetAddress, unitNumber, city, province, postalCode, birthDate,
				phoneNumber);
		// TODO Auto-generated constructor stub
		this.driverStatus = driverStatus;
		this.availability = availability;
		this.experience = experience;
		this.coverLetter = coverLetter;
	}
	
	// set driverStatus
	// driver status can be one of 3
	// 2 : license, have car
	// 1 : license, no car
	// 0 : no license, no car
	public void setDriverStatus(int status) {
		if(status == 0)
			this.driverStatus = "unlicensed";
		else if(status == 1)
			this.driverStatus = "no car";
		else if(status == 2)
			this.driverStatus = "fully licensed";
		else
			this.driverStatus = "unlicensed";
	}
	
	// get driverStatus
	public String getDriverStatus() {
		return driverStatus;
	}
	
	// set availability 
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	
	// get availability
	public String getAvailability() {
		return availability;
	}
	
	//set experience
	public void setExperience(String experience) {
		this.experience = experience;
	}
	
	// get experience
	public String getExperience() {
		return experience;
	}
	
	// set coverLetter
	public void setCoverLetter(String coverLetter) {
		this.coverLetter = coverLetter;
	}
	
	// get coverLetter
	public String getCoverLetter() {
		return coverLetter;
	}

	// return volunteer mailing address
	@Override
	public String getMailingAddress() {
		return String.format("%s %s%n%s",
				super.getFirstName().toUpperCase(), super.getLastName().toUpperCase(),
				super.getMailingAddress());
	}

} // end of volunteer class
