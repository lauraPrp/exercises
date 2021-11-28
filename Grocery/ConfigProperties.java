package exercise;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConfigProperties {
	
	public  String ACCOUNT_SID ;
	public  String AUTH_TOKEN ;
	public  String senderNumber;
	public  String targetNumber;
	
	private static String fileProperties = "eclipse-workspace\\esercizi\\exercises\\config.txt";

    public  synchronized void  getProperties() throws IOException {
        Scanner sc = new Scanner(new FileInputStream(System.getProperty("user.home") + 
				"/" + fileProperties));
        
        while(sc.hasNext()) {
        	  ACCOUNT_SID =  sc.next().equals("ACCOUNT_SID") ?  sc.next():"";
        	   AUTH_TOKEN = sc.next().equals("AUTH_TOKEN") ?  sc.next():"";
        	   senderNumber = sc.next().equals("senderNumber") ?  sc.next():"";
        	   targetNumber = sc.next().equals("targetNumber") ?  sc.next():"";
	
        }

    }

	public  String getACCOUNT_SID() {
		return this.ACCOUNT_SID;
	}

	
	public  String getAUTH_TOKEN() {
		return this.AUTH_TOKEN;
	}

	

	public  String getSenderNumber() {
		return this.senderNumber;
	}

	public String getTargetNumber() {
		return targetNumber;
	}

	public void setTargetNumber(String targetNumber) {
		this.targetNumber = targetNumber;
	}

	

	}