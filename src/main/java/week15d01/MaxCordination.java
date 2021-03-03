//Adott egy függvénygrafikon a koordináta rendszerben. A grafikon néhány pontját megkapjuk egy Map-ben.
// A map kulcsa az x koordináta értéke pedig az y koordináta.
// Döntsük el, hogy a kapott pontok küzül, hol van a függvénynek maximum helye és ott mennyi az értéke.
package week15d01;

import java.util.Map;

public class MaxCordination {
    public Map.Entry<Integer, Integer> getMax(Map<Integer, Integer> coordinates) {
        int x = getX(coordinates);
        Map.Entry<Integer, Integer> result = null;

        for (Map.Entry<Integer, Integer> m : coordinates.entrySet()) {
            if (m.getKey() == x) {
                result = m;
            }
        }
        return result;
    }

    private int getX(Map<Integer, Integer> coordinates) {
        int x = Integer.MIN_VALUE;
        int y = Integer.MIN_VALUE;
        for (Integer i : coordinates.keySet()) {
            if (coordinates.get(i) > y) {
                x = i;
                y = coordinates.get(i);
            }
        }
        return x;
    }
}
