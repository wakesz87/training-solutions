package week07d03;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


class NumberListTest {




        @Test
        public void isIncreasingTest() {

            assertTrue(new NumberList().isIncreasing(Arrays.asList(1, 2, 3, 4)));
            assertTrue(new NumberList().isIncreasing(Arrays.asList(1, 1, 1, 1)));
            assertTrue(new NumberList().isIncreasing(Arrays.asList(-1, 2, 3, 8)));

            assertFalse(new NumberList().isIncreasing(Arrays.asList(-1, -2, 3, 8)));
            assertFalse(new NumberList().isIncreasing(Arrays.asList(2, 1, 3, 8)));


        }
    }



