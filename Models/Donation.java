package Models;

public class Donation{
  private String donationID;
	private String itemsDonated;
	private int donorID;
	private int volunteerID;
	private int organizationID;
	private LocalDate dateRequested;
	private LocalTime timeRequested;
	private LocalDate dateMatchedWithVolunteer;
	private LocalTime timematchedwithVolunteer;
	private LocalDate dateCompleted;
	private LocalTime timeCompleted;
	private Image pictureOfPickup;
	private Image pictureOfDropoff;
	private String ratingOfDelivery;
	
	public Donation(String donationID, String itemsDonated,int donorID, int volunteerID, int orgranizationID, LocalDate dateRequest, LocalTime timeRequest) {
		this.donationID=donationID;
		this.itemsDonated= itemsDonated;
		this.donorID=donorID;
		this.volunteerID=volunteerID;
		this.organizationID=orgranizationID;
		this.dateRequested=dateRequest;
		this.timeRequested=timeRequest;
	}
	
	public Donation(String itemsDonated,int donorID, int volunteerID, int orgranizationID, LocalDate dateRequest, LocalTime timeRequest) {
		this.itemsDonated= itemsDonated;
		this.donorID=donorID;
		this.volunteerID=volunteerID;
		this.organizationID=orgranizationID;
		this.dateRequested=dateRequest;
		this.timeRequested=timeRequest;
	}
	//getter
	public String getDonationID() {
		return this.donationID;
	}
	
	public String getItemsDonated() {
		return this.itemsDonated;
	}
	public int getDonorID()
	{
		return this.donorID;
	}
	
	public int getVolunteerID() {
		return this.volunteerID;
	}
	
	public int getOrgID() {
		return this.organizationID;
	}
	
	public LocalDate getRequestDate() {
		return this.dateRequested;
	}
	public LocalTime getRequestTime() {
		return this.timeRequested;
	}
	
	public LocalDate getMatchDate() {
		return this.dateMatchedWithVolunteer;
	}
	public LocalTime getMatchTime() {
		return this.timematchedwithVolunteer;
	}
	public LocalDate getCompletedDate() {
		return this.dateCompleted;
	}
	public LocalTime getCompletedTime() {
		return this.timeCompleted;
	}
	
	public Image getPickupPicture() {
		return this.pictureOfPickup;
	}
	
	public Image getDropOffPicture() {
		return this.pictureOfDropoff;
	}
	
	public String getRating() {
		return this.ratingOfDelivery;
	}
	
	//setter

	public void setDonationID(String id) {
		 this.donationID=id;
	}
	
	public void setDonationList(String items) {
		 this.itemsDonated =items;
	}
	public void setDonorId(int id)
	{
		this.donorID = id;
	}
	
	public void setVolunteerID(int id) {
		this.volunteerID = id;
	}
	
	public void setOrgID(int id) {
		this.organizationID =id;
	}
	
	public void setRequestDate(LocalDate rDate) {
		this.dateRequested = rDate;
	}
	public void setRequestTime(LocalTime rTime) {
		this.timeRequested=rTime;
	}
	
	public void setMatchDate(LocalDate mDate) {
		this.dateMatchedWithVolunteer =mDate;
	}
	public void setMatchTime(LocalTime mTime) {
		this.timematchedwithVolunteer =mTime;
	}
	public void setCompletedDate(LocalDate cDate) {
		this.dateCompleted = cDate;
	}
	public void setCompletedTime(LocalTime cTime) {
		this.timeCompleted =cTime;
	}
	
	public void setPickupPicture(Image pPic) {
		this.pictureOfPickup = pPic;
	}
	
	public void setDropOffPicture(Image dropPic) {
		this.pictureOfDropoff =dropPic;
	}
	
	public void setRating(String rate) {
		this.ratingOfDelivery=rate;
	}
	
}
