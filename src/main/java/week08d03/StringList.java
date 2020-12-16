package week08d03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*Készíts week08d03 csomagban egy StringLists osztályt és benne
  egy stringListsUnion(List<String> first, List<String> second) metódust,
  mely két string listát vár paraméterül és visszaadja az uniójukat.
  Az úniónak minden elemet tartalmaznia kell mindkét listából,
  de egy elem nem szerepelhet kétszer!
*/

public class StringList {


    public List<String> stringListUnion(List<String> first, List<String> second) {
        List<String> union = new ArrayList<>();

        for (String i : first) {
            union.add(i);
        }


            for (String i : second) {
                if (!union.contains(i)) {
                    union.add(i);
                }


            }
            Collections.sort(union);
            return union;

        }

  /*  public static void main(String[] args) {
        List<String> first = Arrays.asList("a","b","c");
        List<String> second = Arrays.asList("a", "d");
        StringList sl = new StringList();
        System.out.println(first);
        System.out.println(second);
        System.out.println(sl.stringListUnion(first, second));
    } */

    }











