package Models;

public class Donor extends User {

	public Donor(String firstName, String lastName, String emailAddress, String streetAddress, String unitNumber,
			String city, String province, String postalCode, String birthDate, String phoneNumber) {
		super(firstName, lastName, emailAddress, streetAddress, unitNumber, city, province, postalCode, birthDate,
				phoneNumber);
		// TODO Auto-generated constructor stub
	}

	// return donor mailing address
	@Override
	public String getMailingAddress() {
		return String.format("%s %s%n%s",
				super.getFirstName().toUpperCase(), super.getLastName().toUpperCase(),
				super.getMailingAddress());
	}

}
