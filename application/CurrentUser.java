package application;

public class CurrentUser
{
	public static int currentUserID = 0;
	
	public static void setCurrentUser(int ID)
	{
		currentUserID = ID;
	}
	
	public static int getCurrentUser()
	{
		return currentUserID;
	}
}