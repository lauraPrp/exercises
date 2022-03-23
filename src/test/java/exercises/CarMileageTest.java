package exercises;


import exercises.CarMileage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarMileageTest {


    @Test
    public void testBig() {

        assertEquals(1, CarMileage.isInteresting(34567889, new int[]{1337, 256}));

    }
}

