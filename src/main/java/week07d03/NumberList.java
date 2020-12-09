package week07d03;

import java.util.List;

public class NumberList {

    public boolean isIncreasing(List<Integer> numbs) {


        for (int i = 0; i < numbs.size()-1; i++) {
            if (numbs.get(i + 1) < numbs.get(i)) {
                return false;
            }
        }
        return true;
    }
}
