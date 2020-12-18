package week08d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {
    MathAlgorithms ma = new MathAlgorithms();
    @Test
    public void greatestCommonDivison(){
        assertEquals(1, ma.greatestCommonDivisor(31,45));
    }

}





