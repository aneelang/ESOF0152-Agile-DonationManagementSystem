package client;

import utilities.*;
import java.io.IOException;
import csArch.client.*;
public class Client extends AbstractClient{
	
	//Instance variables **********************************************
	 String clientSession;

	//Constructors ****************************************************
	  
	  /**
	   * Constructs an instance of the chat client.
	   *
	   * @param host The server to connect to.
	   * @param port The port number to connect on.
	   * @param clientUI The interface type variable.
	   */
	  
	  public Client (String host, int port) throws IOException 
	  {
	    super(host, port); //Call the superclass constructor
	    openConnection();
	  }
	  
	  /**
	   * This method handles all data that comes in from the server.
	   *
	   * @param msg The message from the server.
	   */
	  public void handleMessageFromServer(Object msg) {
		  dPackets dMsg= (dPackets)msg;
		  //test
		  System.out.println("Message from server Message from server !" + dMsg.getArg1());
		  
		  
		  //use dpacket message from server..
		  //check type of reply
		  
	  }
	  
	  
	  /**
	   * This method handles all data coming from the UI            
	   *
	   * @param message The message from the UI.    
	   */
	  public void handleMessageFromClientUI(String message)
	  {
	    try
	    {
	      sendToServer(message);
	    }
	    catch(IOException e)
	    {
	      quit();
	    }
	  }
	  
	  /**
	   * This method terminates the client.
	   */
	  public void quit()
	  {
	    try
	    {
	      closeConnection();
	    }
	    catch(IOException e) {}
	    System.exit(0);
	  }

	  public String getSessionType() {
	        return clientSession;
	       
	    }
}
