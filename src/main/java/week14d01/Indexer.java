//Készíts egy Indexer osztályt, melynek van egy public Map<Character, List<String>> index(List<String> names) metódusa.
// A feladat az, hogy egy indexet készítsünk a megadott nevek kezdőbetűiből (minden kezdőbetűt társítsunk az összes névvel,
// mely ezzel a betűvel kezdődik). Példa:
//System.out.println(new Indexer().index(Arrays.asList("Odon", "Lujza", "Abraham", "Magdolna")));
//// {A=[Abraham], L=[Lujza], M=[Magdolna], O=[Odon]}
package week14d01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Indexer {
    public Map<Character, List<String>> index(List<String> names) {
        Map<Character, List<String>> nameMap =new TreeMap<>();
        for (String s : names) {
            if (!nameMap.containsKey(s.charAt(0))) {
                List<String> nameList = new ArrayList<>();
                nameList.add(s);
                nameMap.put(s.charAt(0), nameList);
            } else {
                nameMap.get(s.charAt(0)).add(s);
            }
        }
        return nameMap;
    }
}
