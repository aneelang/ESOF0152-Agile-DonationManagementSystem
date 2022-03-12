package server;
import utilities.*;
import java.sql.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import csArch.server.AbstractServer;
import csArch.server.ConnectionToClient;
import utilities.*;

public class Server extends AbstractServer{
	final public static int DEFAULT_PORT = 5555;
	  
	  //Constructors ****************************************************
	  
	  /**
	   * Constructs an instance of the echo server.
	   *
	   * @param port The port number to connect on.
	   */
	public Server(int port) 
	{
	  super(port);
	}
	

	  //Instance methods ************************************************
	  
	  /**
	   * This method handles any messages received from the client.
	   *
	   * @param msg The message received from the client.
	   * @param client The connection from which the message originated.
	   */
	public void handleMessageFromClient (Object msg, ConnectionToClient client) {
		System.out.println("Message received: "  +msg.toString()+ " from " + client);
		
		//received message
		dPackets dMsg = (dPackets)msg;
		
		//reply to client 
		dPackets reply;
		
		
		//check type of request
		//pseudo code: 
		//if(dMsg.getTypeOfrequest().equals("register"))
		//	 do..
		//  reply= ..
		//
		//Then send reply
		//try {
        //    client.sendToClient(reply);
        //} catch (IOException ex) {
        //    Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        ///}
	}
	
	
	 /**
	   * This method overrides the one in the superclass.  Called
	   * when the server starts listening for connections.
	   */
	  protected void serverStarted() {
	      
	        
	      System.out.println("Server listening for connections on port " + getPort());
	        
	  }
	  
	  /**
	   * This method overrides the one in the superclass.  Called
	   * when the server stops listening for connections.
	   */
	  protected void serverStopped()
	  {
	    System.out.println
	      ("Server has stopped listening for connections.");
	  }
	  
	
	  /**
	   * This method is responsible for the creation of 
	   * the server instance (there is no UI in this phase).
	   *
	   * @param args[0] The port number to listen on.  Defaults to 5555 
	   *          if no argument is entered.
	   */
	  public static void main(String[] args) 
	  {
	    int port = 0; //Port to listen on

	    try
	    {
	      port = Integer.parseInt(args[0]); //Get port from command line
	    }
	    catch(Throwable t)
	    {
	      port = DEFAULT_PORT; //Set port to 5555
	    }
	    Server sv = new Server(port);
	    
	    try 
	    {
	       
	      //sv.ConnectToDatabase();
	      sv.listen(); //Start listening for connections
	        
	      
	    } 
	    catch (Exception ex) 
	    {
	      System.out.println("ERROR - Could not listen for clients!");
	    }
	  }
}
