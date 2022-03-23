package  exercises;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StreamsLambdaEx {
	private static Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

	public static boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false; 
	    }
	    return pattern.matcher(strNum).matches();
	}
	
	static int numberOfMappedValues = 0;
	static List<Integer> mappedValues = new ArrayList<>();
	/*which receives an ArrayList of integers, and returns the positive integers from the list.

Implement the method using stream! For collecting the numbers try the command Collectors.toList() 
in addition to the Collectors.toCollection(ArrayList::new) command.*/
	static List<Integer> positive(ArrayList<Integer> numbers){
		List<Integer> result = new ArrayList<>();
	//	List <T >result=  numbers.stream().filter(num -> num>0).map(num ->num<100).collect(Collectors.toList());
	 result = numbers.stream().filter(x -> x >0).collect(Collectors.toList());

		
		System.out.println("QUA: "+result);
		return result;
		
	}
	
	public static void main(String args[]) {
		
	Scanner scanner = new Scanner(System.in);
	ArrayList<Integer> inputs = new ArrayList<>();

	// reading inputs
	boolean stop=true;
	while (stop) {
	    String num=scanner.next();
	    if (isNumeric(num) ) {
	    	inputs.add(Integer.parseInt(num));
	    }else {
			
			stop=false;
			scanner.close();
	    }
	   // }
	}
	System.out.println("inputs "+inputs);
	List<Integer> positivenums =positive(inputs);
	System.out.println("+++++ "+positivenums);
	
	
	/*

	// determining the number of values divisible by three
	long numbersDivisibleByThree = inputs.stream()
	    .mapToInt(s -> {
	        // variables declared outside of an anonymous function cannot be used, so this won't work
	        numberOfMappedValues++;
	        return Integer.valueOf(s);
	    }).filter(value -> value % 3 == 0)
	    .count();

	System.out.println(numbersDivisibleByThree);
*/	}
	
}
