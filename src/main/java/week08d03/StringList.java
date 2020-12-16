package week08d03;

import java.util.ArrayList;
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


            for (String p : second) {
                if (!union.contains(p)) {
                    union.add(p);
                }


            }
            Collections.sort(union);
            return union;

        }

    }











