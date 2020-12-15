package week08d02;

/*Készíts a week08d02 csomagban egy Lottery osztályt,
 melynek legyen egy getNumbers() metódusa, ami visszaad
 egy listát amiben 5 véletlen szám van 1-90 között, tehát
  kvázi készíts egy lottósorsoló programot.
  A sorrendre nem kell figyelni, a lényeg, hogy a számok különbözők legyenek! (edited)
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lottery {


    public List<Integer> getLotteryNumbers() {
        Random random = new Random(90);
        Integer newNumber = null;
        List<Integer> lotteryNumbers = new ArrayList<Integer>();
        for (int y = 0; y < 5; y++) {
            do {
                newNumber = random.nextInt(90) + 1;
            } while (lotteryNumbers.contains(newNumber));
            lotteryNumbers.add(newNumber);
        }
        Collections.sort(lotteryNumbers);
        return lotteryNumbers;
    }

    public static void main(String[] args) {
        List<Integer> ln = new Lottery().getLotteryNumbers();
        System.out.println(ln);
    }
}


