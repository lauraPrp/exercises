package exercise;

import java.util.regex.Pattern;
import java.lang.StringBuffer;
public class CarMileage {

  public static int isInteresting(int number, int[] awesomePhrases) 
  {
    int ret =0;
    if( (all0(number) || sameNum(number) || isSeqInc(number) ||
        isSeqDec(number) || isPalindrome(number) || isAwe(number, awesomePhrases) ) 
        && (Integer.toString(number).length() >=3) )
    {
      ret =2;
    }
    else if( ( (all0(number + 1) || sameNum(number + 1) || isSeqInc(number + 1) ||
        isSeqDec(number + 1) || isPalindrome(number + 1) || isAwe(number + 1, awesomePhrases) ) 
        && (Integer.toString(number + 1).length() >=3) ) || 
        ( (all0(number + 2) || sameNum(number + 2) || isSeqInc(number + 2) ||
        isSeqDec(number + 2) || isPalindrome(number + 2) || isAwe(number + 2, awesomePhrases) ) 
        && (Integer.toString(number + 2).length() >=3) ) )
    {
      ret=1;
    } 

    return ret;
  }

  // Any digit followed by all zeros
  private static boolean all0(int number)
  {
    String numberStr = Integer.toString(number);
    return Pattern.matches("[1-9]0+", numberStr);
  }

  //Every Digit is the same number
  private static boolean sameNum(int number)
  {
    String numberString = Integer.toString(number);
    String replacedString = numberString.replaceAll( numberString.substring(0,1), "");
    return replacedString.length() ==0;
  }

  //The digits are sequential, incrementing
  private static boolean isSeqInc(int number)
  {
    String numberString = Integer.toString(number);
    char currChar = numberString.charAt(0);
    for( int i=1; i<numberString.length(); i++)
    {
      if( ( currChar=='9' && numberString.charAt(i) == '0') || ( currChar == numberString.charAt(i)-1 ) )
      {
        currChar= numberString.charAt(i);
      }
      else
      {
        return false;
      }
    }
    return true;
  }

  //The digits are sequential, decrementing
  private static boolean isSeqDec(int number)
  {
    String numberString = Integer.toString(number);
    char currChar = numberString.charAt(0);
    for( int i=1; i<numberString.length(); i++)
    {
      if( ( currChar=='1' && numberString.charAt(i) == '0') || ( currChar - 1 == numberString.charAt(i) ) )
      {
        currChar= numberString.charAt(i);
      }
      else
      {
        return false;
      }
    }
    return true;
  }

  //The digits are a palindrome
  private static boolean isPalindrome(int number)
  {
    StringBuffer numberString = new StringBuffer(Integer.toString(number));

    return numberString.toString().equals(numberString.reverse().toString());
  }

  //The digits match one of the values in the awesomePhrases array
  private static boolean isAwe(int number, int[] awesomePhrases)
  {
    for(int i=0; i< awesomePhrases.length; i++)
    {
      if( awesomePhrases[i] == number)
      {
        return true;
      }
    }
    return false;
  }
}



/*
 * 
 public class CarMileage {

  public static boolean isReallyInteresting(int number, final int[] awesomePhrases) {
    return Stream.<Predicate<String>>of(
            s -> s.matches("\\d0+"),
            s -> new StringBuilder(s).reverse().toString().equals(s),
            s -> "1234567890".contains(s),
            s -> "9876543210".contains(s),
            s -> Arrays.stream(awesomePhrases).anyMatch(n -> parseInt(s) == n)
    ).anyMatch( p -> number > 99 && p.test(Integer.toString(number)));
  }
  
  public static int isInteresting(int number, int[] awesomePhrases) {
    return isReallyInteresting(number, awesomePhrases) ? 2 : 
           isReallyInteresting(number + 1, awesomePhrases) ? 1 : 
           isReallyInteresting(number + 2, awesomePhrases) ? 1 : 0;
  }
  
}

*
*/


















/*import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class CarMileage {
	final static int MAX_NUM=1000000000;
	
	
	public static boolean allZeros(int num) {
		 String numberStr = Integer.toString(number);
    return Pattern.matches("[1-9]0+", numberStr);
	}
	
	
	public static boolean sameNumber(int num) {
		 String numberString = Integer.toString(num);
		    String replacedString = numberString.replaceAll( numberString.substring(0,1), "");
		    return replacedString.length() ==0;
	}


	
	private  static boolean isSequentialInc(int num) {
		
		String numberString = Integer.toString(num);
	    char currChar = numberString.charAt(0);
	    for( int i=1; i<numberString.length(); i++)
	    {
	      if( ( currChar=='9' && numberString.charAt(i) == '0') || ( currChar == numberString.charAt(i)-1 ) )
	      {
	        currChar= numberString.charAt(i);
	      }
	      else
	      {
	        return false;
	      }
	    }
	    return true;
	    /*boolean seq = false;	
		int nums[]= Integer.toString(num).chars().map(a->a-'0').toArray();
		List<Integer> al = new ArrayList<Integer>();// Arrays.asList(nums);
		for(int i=0;i<nums.length;i++) {
			al.add(Integer.valueOf(nums[i]));
		}	
		 
		seq =  IntStream.range(1, al.size()).allMatch(value -> al.get(value) - al.get(value - 1) == 1);
		//if it doesnt increment check if it decrements
	if(seq==false) {
		seq =  IntStream.range(1, al.size()).allMatch(value -> al.get(value) - al.get(value + 1) == 1);
	}
	
		return seq;
	*//*}
	private static boolean isSequentialDec(int num) {
		String numberString = Integer.toString(num);
	    char currChar = numberString.charAt(0);
	    for( int i=1; i<numberString.length(); i++)
	    {
	      if( ( currChar=='1' && numberString.charAt(i) == '0') || ( currChar - 1 == numberString.charAt(i) ) )
	      {
	        currChar= numberString.charAt(i);
	      }
	      else
	      {
	        return false;
	      }
	    }
	    return true;
	}
	public static boolean isPalindrome(int num) {
		int reversedNum = 0, remainder;
	    
	    int originalNum = num;
	    
	    while (num != 0) {
	      remainder = num % 10;
	      reversedNum = reversedNum * 10 + remainder;
	      num /= 10;
	    }
	    
	    if (originalNum == reversedNum) {
	    	return true;
	    }
	    
		return false;
	}
	
	public static boolean isAwesome(int num,int[] awe) {
		for(int i=0;i<awe.length;i++) {
			if(num==awe[i]) {
				return true;
			}
		}
		return false;
	}

	  public static int isInteresting(int number, int[] awesomePhrases) {
		  int ret= 0;
			if(number<100 || number>MAX_NUM) return 0;
			    if( (allZeros(number) || isSequentialInc(number) || isSequentialDec(number) ||
			        isPalindrome(number) || sameNumber(number) || isAwesome(number, awesomePhrases) ) 
			        && (Integer.toString(number).length() >=3) )
			    {
			      ret =2;
			    }
			    else if( ( (allZeros(number + 1) || isSequentialInc(number + 1) || isSequentialDec(number + 1) ||
			    		isPalindrome(number + 1) || sameNumber(number + 1) || isAwesome(number + 1, awesomePhrases) ) 
			        && (Integer.toString(number + 1).length() >=3) ) || 
			        ( (allZeros(number + 2) || isSequentialInc(number + 2) || isSequentialDec(number + 2) ||
			        		isPalindrome(number + 2) || sameNumber(number + 2) || isAwesome(number + 2, awesomePhrases) ) 
			        && (Integer.toString(number + 2).length() >=3) ) )
			    {
			      ret=1;
			    } 

			    return ret;
		}
	
	  
	  
	  
	  
	  }
	*/  
	