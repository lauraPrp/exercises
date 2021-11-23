

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;
import javafx.util.Pair;

/*
 * this class simulates the use of keyboard with a tv controller, the aim is count the steps needed to digit a word
 * each letter is followed by a OK button press that has to be included in the count, it's necessary to take the shorter route
 * from one letter to another, the prompt always starts on the letter A (0,0) 
 * */

public class Keyboard {
	
	public static int stepCounter(ArrayList<Pair<Integer,Integer>> pair) { 
	int counter=0;
		
	for(int i=0; i<pair.size()-1;i++) {
		ListIterator<Pair<Integer, Integer>> t = pair.listIterator(i);
		Pair<Integer,Integer> p = pair.get(i);
	
		Pair<Integer,Integer> p2 = pair.get(i+1);
		int step1= Math.abs(p.getKey()-p2.getKey());
		int step2= Math.abs(p.getValue()-p2.getValue());
		counter=counter+(step1+step2);
		counter++;//simulates OK button
		//System.out.println("*****************************"+ counter);
	}
	
	return counter;
	}

	public static Pair<Integer,Integer> findLetter(String letter) {
		
		Pair<Integer,Integer> resPair = new Pair<> (0,0);		
	
	String[][] keyboard ={//new String[5][8]
			{"a","b","c","d","e","1","2","3"},
			{"f","g","h","i","j","4","5","6"},
			{"k","l","m","n","o","7","8","9"},
			{"p","q","r","s","t",".","@","0"},
			{"u","v","w","x","y","z","_","/"}
		  };

for(int i = 0; i<keyboard.length;i++) {
for (int j=0; j<keyboard[i].length; j++) {
if(keyboard[i][j].equalsIgnoreCase(letter)) {
	resPair=new Pair<>(i,j);
}
}
}
	return resPair;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String input1=sc.next();
		String letter="";
		Pair<Integer,Integer> pairs= new Pair<>(0,0);
		ArrayList<Pair<Integer,Integer>> arr= new ArrayList<>();
		int str1len =input1.length();
		arr.add(new Pair<>(0,0));
		for(int i=0; i<str1len;i++) {
			letter=Character.toString(input1.charAt(i));
			pairs= findLetter(letter);
			arr.add(pairs);
		}
		
	
	int totalSteps= stepCounter(arr);
	System.out.println("total steps:" +totalSteps);
	sc.close();
	}	
		
	}
	

