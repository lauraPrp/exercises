package exercise;

import java.util.ArrayList;
import java.util.Scanner;

	/*
	 * this class simulates the use of keyboard with a tv controller, the aim is count the steps needed to digit a word
	 * each letter is followed by a OK button press that has to be included in the count, it's necessary to take the shorter route
	 * from one letter to another, the prompt always starts on the letter A (0,0)
	 * */

	public class KeyboardSimulator {

		private static String[][] keyboard ={ //new String[5][8];
				{"a","b","c","d","e","1","2","3"},
				{"f","g","h","i","j","4","5","6"},
				{"k","l","m","n","o","7","8","9"},
				{"p","q","r","s","t",".","@","0"},
				{"u","v","w","x","y","z","_","/"}
		};
		
		public static int stepCounter(ArrayList<Coordinates> xy) {
			int counter=0;

			for(int i=0; i<xy.size()-1;i++) {

				Coordinates coordStart = xy.get(i);
				Coordinates coordEnd = xy.get(i+1);
				int step1= Math.abs(coordStart.getX()-coordEnd.getX());
				int step2= Math.abs(coordStart.getY()-coordEnd.getY());
				counter=counter+(step1+step2);
				counter++;//simulates OK button
				//System.out.println("*****************************"+ counter);
			}

			return counter;
		}

		public static  Coordinates findLetter(String letter) {

			Coordinates resPair = null;

			for(int i = 0; i<keyboard.length;i++) {
				for (int j=0; j<keyboard[i].length; j++) {
					if(keyboard[i][j].equalsIgnoreCase(letter)) {
					 resPair = new Coordinates(i,j);
					}
					}
				}
			return resPair;
		}

		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			String input1=sc.next();
			
			ArrayList<Coordinates> arr= new ArrayList<>();
			for(int i=0; i<input1.length();i++) {
				String letter=Character.toString(input1.charAt(i));
				Coordinates coords= findLetter(letter);
				arr.add(coords);
			}


			int totalSteps= stepCounter(arr);
			System.out.println("total steps:" +totalSteps);
			sc.close();
		}
		
		
		static  class Coordinates {

			int x;
			int y;
				/**
			 * @param x
			 * @param y
			 */
			public Coordinates(int x, int y) {
				super();
				this.x = x;
				this.y = y;
			}
				public int getX() {
					return x;
				}
				
				public int getY() {
					return y;
				}
				
		}
		

	}


