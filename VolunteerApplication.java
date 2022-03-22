package Models;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class VolunteerApplication {
	private int volunteerAppID;
	private int volunteerID;
	private int organizationID;
	private LocalDate applicationDate;
	private String appStatus;
	private String reasonForVolunteering;
	
	
	public VolunteerApplication(int volunteerAppID, int volunteerID, int orgID, String reasonString) {
		this.volunteerAppID =volunteerAppID;
		this.volunteerID = volunteerID;
		this.organizationID=orgID;
		this.applicationDate = LocalDate.now();
		this.reasonForVolunteering=reasonString;
	}
	
	public VolunteerApplication(int volunteerID, int orgID, String reasonString) {
		this.volunteerID = volunteerID;
		this.organizationID=orgID;
		this.applicationDate = LocalDate.now();
		this.reasonForVolunteering=reasonString;
	}
	
	//getter
	public int getVolunteerAppID() {
		return this.volunteerAppID;
	}
	
	public int getVolunteerID() {
		return this.volunteerID;
	}
	
	public int getOrgID() {
		return this.organizationID;
	}
	
	public LocalDate getAppDate() {
		return this.applicationDate;
	}
	
	public String getAppStatus() {
		return this.appStatus;
	}
	
	public String getReason() {
		return this.reasonForVolunteering;
	}
	
	
	//setter
	public void setVolunteerAppID(int id) {
		this.volunteerAppID=id;
	}
	
	
	public void setVolunteerID(int id)
	{
		this.volunteerID=id;
	}
	
	public void setOrgID(int id)
	{
		this.organizationID=id;
	}
	
	public void setAppDate(LocalDate d) {
		this.applicationDate=d;
	}
	
	public void setReason(String reason)
	{
		this.reasonForVolunteering=reason;
	}
	
	
}
