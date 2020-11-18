package stringconcattest;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ScannerTest {
    @Test
    public void testScanner() {
        Scanner s = new Scanner("aaa bbb ccc ddd eee fff");
        List<String> l = new ArrayList<>();
        // if(s.hasNext()) {
       while(s.hasNext()) {
           l.add(s.next());
          // String t = s.next();
          // System.out.println(t);

           Scanner t = new Scanner("12,13,14,15,16");
           while (t.hasNextInt()) {
               int i = t.nextInt();
               System.out.println(i);
           }

       }



    }
}
