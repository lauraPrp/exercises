package org.laura.exercise.Grocery;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroceryShopping {
	private static String filesPath = "eclipse-workspace\\esercizi\\src\\exercise\\";
	public static String shopName="all";
	
	 List<String> groceryShopping = new ArrayList<String>();
		

public  List<String>  loadList(String shopName) throws IOException {
	List<String> groceryList= new ArrayList<>() ;
	if(shopName.equals("all")) {
	System.out.println("TBI NOT IMPL YET");	
	}else {
    Scanner sc = new Scanner(new FileInputStream(System.getProperty("user.home") + 
			"/" +filesPath.concat(shopName.concat(".txt"))));
    
			
			    while(sc.hasNext()) {
			     groceryList.add(sc.next());
			    }	  
	}
			    
 return groceryList;   
}	
	
	
	
	
	public static void main(String[] args) {
		List<String> lista =new ArrayList<>();
		GroceryShopping gs = new GroceryShopping();
		try {
			
			lista =gs.loadList("Tesco");
			
			for(String s:lista) {
				System.out.println("-"+s);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}

}
