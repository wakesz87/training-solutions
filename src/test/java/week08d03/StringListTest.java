package week08d03;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringListTest {

    @Test
    void testListsUnited() {
        StringList st = new StringList();
        List<String> result = st.stringListUnion(List.of("a", "b", "c"), List.of("a", "d"));
        assertEquals("[a, b, c, d]", result.toString());
    }
}

