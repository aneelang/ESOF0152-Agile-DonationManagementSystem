package application;

import javafx.beans.property.SimpleStringProperty;

public class HelperClassVolunteerTable {
	
	private SimpleStringProperty firstName;
	private SimpleStringProperty lastName;
	private SimpleStringProperty postalCode;
	private SimpleStringProperty phoneNumber;
	
	public HelperClassVolunteerTable(String firstName, String lastName, String postalCode, String phoneNumber ) {
		//super();
		this.firstName = new SimpleStringProperty(firstName);
		this.lastName = new SimpleStringProperty(lastName);
		this.postalCode = new SimpleStringProperty(postalCode);
		this.phoneNumber = new SimpleStringProperty(phoneNumber);
	}
	
	public String getFirstName() {
		return firstName.get();
	}
	public String getLastName() {
		return lastName.get();
	}
	public String getPostalCode() {
		return postalCode.get();
	}
	public String getPhoneNumber() {
		return phoneNumber.get();
	}
}
