package week07d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitSumTest {
    @Test
    public void testDigitSum() {
        assertEquals(6, DigitSum.sumOfDigits(123));

    }

}
/*Készíts egy week07d02.DigitSum osztályt és benne sumOfDigits(int x) metóódus
     mely visszaadja  a paraméterül kapott szám számjegyeinek összegét!
     pl.: 123 esetén a visszatérési érték 6.
     (Bocsi, hogy megint matekos holnap már nem az lesz ígérem */
/*
 public int sumOfDigits(int x){
        int sum = 0;
        String stringX = String.valueOf(x);
        for(int i = 0; i < stringX.length(); i++){
            sum += Character.getNumericValue(stringX.charAt(i));
        }
        return sum;
}
 */