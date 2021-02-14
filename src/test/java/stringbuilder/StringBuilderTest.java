package stringbuilder;


import org.junit.jupiter.api.Test;

public class StringBuilderTest {

    @Test

    public void testAppend(){
        StringBuilder sb = new StringBuilder();

        String s = sb.toString();
        System.out.println(s);

    }

}