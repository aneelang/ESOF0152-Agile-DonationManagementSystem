package Models;

public abstract class User {
	//abstract user can be: Org, Donor, Volunteer
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String streetAddress;
	private String unitNumber;
	private String city;
	private String province;
	private String postalCode;
	private String birthDate;
	private String phoneNumber;
	
	// constructor one
	public User(String firstName, String lastName, String emailAddress,
			String streetAddress, String unitNumber, String city, String province, 
			String postalCode, String birthDate, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.birthDate = birthDate;
		this.streetAddress = streetAddress;
		this.unitNumber = unitNumber;
		this.postalCode = postalCode;
		this.city = city;
		this.province = province;
	}
	
	// constructor two
	public User(String streetAddress, String unitNumber, String city, String province, 
			String postalCode, String phoneNumber) {
		this.streetAddress = streetAddress;
		this.unitNumber = unitNumber;
		this.city = city;
		this.province = province;
		this.postalCode = postalCode;
		this.phoneNumber = phoneNumber;
	}
	
	// set firstName : for editing profile feature
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	// get firstName
	public String getFirstName() {
		return firstName;
	}
	
	// set lastName : for editing profile feature
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	// get lastName
	public String getLastName() {
		return lastName;
	}
	
	// set emailAddress
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	// get emailAddress
	public String emailAddress() {
		return emailAddress;
	}
	
	// set street address
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	
	// get street address
	public String getStreetAddress() {
		return streetAddress;
	}
	
	// set unitNumber
	public void setUnitNumber(String unitNumber) {
		this.unitNumber = unitNumber;
	}
	
	// get unitNumber
	public String getUnitNumber() {
		return unitNumber;
	}
	
	// set city
	public void setCity(String city) {
		this.city = city;
	}
	
	// get city
	public String getCity() {
		return city;
	}
	
	// set province
	public void setProvince(String province) {
		this.province = province;
	}
	
	// get province
	public String getProvince() {
		return province;
	}
	
	// set postalCode
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	// get postalCode
	public String getPostalCode() {
		return postalCode;
	}
	
	// set birthDate
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	
	// get birthDate
	public String getBirthDate() {
		return birthDate;
	}
	
	// set phoneNumber
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	// get phoneNumber
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	// get mailing address of user
	public String getMailingAddress() {
		return String.format("%s %s\n%s %s  %s",
				getUnitNumber().toUpperCase(), getStreetAddress().toUpperCase(),
				getCity().toUpperCase(), getProvince().toUpperCase(),
				getPostalCode().toUpperCase());
	}
} // end of user abstract class
