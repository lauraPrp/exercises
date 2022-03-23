package org.laura.exercise.Grocery;
import java.io.IOException;

public class SendSMS {
	
	public static String ACCOUNT_SID ;
	public static String AUTH_TOKEN ;
	public static String senderNumber;
	public static String targetNumber;
	public static String text ="";
	
	  // Register your Account to get Sid and Token at twilio.com/user/account
	 
	  public static void main(String[] args) {
		  try {
			GroceryShopping gs = new GroceryShopping();
			gs.loadList("Tesco");
			ConfigProperties configProperties = new ConfigProperties();
			configProperties.getProperties() ;
			ACCOUNT_SID =configProperties.getACCOUNT_SID();
			AUTH_TOKEN=configProperties.getAUTH_TOKEN();
			senderNumber =configProperties.getSenderNumber();
			targetNumber =configProperties.getTargetNumber();
//			System.out.println("ACCOUNT_SID :"+ACCOUNT_SID);
//			System.out.println("AUTH_TOKEN :"+AUTH_TOKEN);
//			System.out.println("sender :"+senderNumber);
//			System.out.println("target :"+targetNumber);
			
			text = gs.loadList("Tesco").toString();
			System.out.println("list  :"+text);
		  } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  //uncomment to make it work
	   /* Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

	    Message message = Message.creator(new PhoneNumber(targetNumber), 	 
	    		new PhoneNumber(senderNumber), 
	    		text).create();

	    System.out.println(message.getSid());*/
	  }
	}
