package week12d03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberStatTest {

    @Test
    void myMethod() {
        NumberStat numberStat = new NumberStat();

        numberStat.integerFromFile();
        int result=numberStat.smallestUnique();
        Assertions.assertEquals(3,result);
    }
}
©