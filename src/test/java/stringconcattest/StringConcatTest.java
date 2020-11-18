package stringconcattest;

import org.junit.jupiter.api.Test;

public class StringConcatTest {
    @Test
    public void testconcat() {
        String s = "john";
        s = s + " Doe";
        //s.concat(" Doe");
        System.out.println(s);
        String t = 1 + 2 + "value";
        System.out.println(t);

        String k = "value" + 1 + 2;
        System.out.println(k);

        int i = 8;
        String f = Integer.toString(i);
        System.out.println(f);

        String q = String.join("-", "John", "Doe");
        System.out.println(q);
    }
}
