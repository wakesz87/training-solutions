package week11d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisorFinderTest {
    @Test
    public void DivisorTest(){
     DivisonFinder divisorfinder= new DivisonFinder();

        assertEquals(1, divisorfinder.findDivisors(425));

    }
}