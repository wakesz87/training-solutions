package week07d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitSumTest {
    @Test
    public void testDigitSum() {
        assertEquals(6, DigitSum.sumOfDigits(123));
    }

}