package week08d03;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringListTest {

    @Test
    void testListsUnited() {
        List<String> first = Arrays.asList("a","b","c");
        List<String> second = Arrays.asList("a", "d");
        StringList sl = new StringList();

     assertEquals(Arrays.asList("a", "b", "c", "d"), sl.stringListUnion(first, second));
    }
}

