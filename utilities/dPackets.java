package utilities;
import java.io.Serializable;


/*
 * This packet would be the communication protocol between
 * Clients and Server
 */
public class dPackets implements Serializable{
	//Type of request (could be get or post)
	String typeOfRequest;
	//post request: object to insert/modify/delete from database
	//get request: when received, could be null/empty.
	//			when sent, could contain a simple string or rows from database
    Object arg1;
    public dPackets(String typeOfRequest, Object arg1){
        
        this.typeOfRequest = typeOfRequest;
        this.arg1 = arg1;
    }
    
   public String getTypeOfRequest(){
       return typeOfRequest;
   }
   public Object getArg1(){
       return arg1;
   }
    
}
