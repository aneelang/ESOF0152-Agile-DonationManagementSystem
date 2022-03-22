package Models;

public class Account {
	private String accountID; 
	private String accountUsername;
	private String accountPassword;
	private String typeOfAccount;
	
	public Account(String accountId, String accountUsername, String accountPassword, String typeOfAccount) {
		this.accountID=accountId;
		this.accountPassword=accountPassword;
		this.accountUsername=accountUsername;
		this.typeOfAccount=typeOfAccount;
				
	}
	
	public String getAccID() {
		return accountID;
	}
	public String getAccPass() {
		return accountPassword;
	}
	public String getAccUsername() {
		return accountUsername;
	}
	public String getAccType() {
		return typeOfAccount;
	}
	
	
	public void setAccID(String accID) {
		this.accountID =accID;
	}
	
	public void setAccUsername(String accUsername) {
		this.accountID =accUsername;
	}
	
	public void setAccPass(String accPass) {
		this.accountID =accPass;
	}
	
	public void setAccType(String accType) {
		this.accountID =accType;
	}
}
