package week08d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {
    @Test
    void getLotteryNumbers() {
        // List<Integer> ln = new Lottery().getLotteryNumbers();
        // System.out.println(ln);
        assertEquals("[40, 52, 60, 83, 90]", new Lottery().getLotteryNumbers().toString());

    }

}