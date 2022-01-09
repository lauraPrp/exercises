package exercise;


	import org.junit.Test;

	import static org.junit.Assert.assertEquals;

import org.junit.Ignore;

	public class CarMileageTest {

	
	  @Test 
	  public void testBig() {

	    assertEquals(1, CarMileage.isInteresting(34567889, new int[]{1337, 256}));
	  
	  }
	}

