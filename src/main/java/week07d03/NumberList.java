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

/*Junior/ Mid-level csoport mai feladat:
A week07d03 csomagban hozz létre egy NumberList osztályt.
 Ennek legyen egy metódusa isIncreasing(List<Integer>)
 mely egy számokból álló listát vár paraméterül és megnézi,
 hogy a listában a számok növekvő sorrendben szerepelnek-e
 és ennek megfelelően igaz vagy hamis értékkel tér vissza.
 Speciális eset ha két egymást követő szám egyenlő,
 ez nem probléma a 1,2,3,3,3,5 számokat növekvőnek tekintjük. (edited)*/