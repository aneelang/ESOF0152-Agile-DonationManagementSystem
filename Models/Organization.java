package Models;

import javafx.scene.image.Image;

public class Organization extends User {

	private String orgName;
	private String website;
	private Image logo;
	private String missionStatement;
	
	public Organization(String orgName, String website, Image logo, String streetAddress, String unitNumber, 
			String city, String province, String postalCode, String phoneNumber, String missionStatement) {
		super(streetAddress, unitNumber, city, province, postalCode, phoneNumber);
		// TODO Auto-generated constructor stub
		this.orgName = orgName;
		this.website = website;
		this.logo = logo;
		this.missionStatement = missionStatement;
	}
	
	// set orgName
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	
	// get orgName
	public String getOrgName() {
		return orgName;
	}
	
	// set website
	public void setWebsite(String website) {
		this.website = website;
	}
	
	// get website
	public String getWebsite() {
		return website;
	}
	
	// set logo : for editing logo
	public void setLogo(Image logo) {
		this.logo = logo;
	}
	
	// get organization logo : to be used in the donor registration page
	public Image getLogo() {
		return logo;
	}
	
	// set missionStatement
	public void setMissionStatement(String missionStatement) {
		this.missionStatement = missionStatement;
	}
	
	// get missionStatement
	public String getMissionStatement() {
		return missionStatement;
	}
	
	// return organization mailing address
	@Override
	public String getMailingAddress() {
		return String.format("%s%n%s",
				getOrgName().toUpperCase(), super.getMailingAddress());
	}

}
