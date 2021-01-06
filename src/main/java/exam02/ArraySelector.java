package exam02;

import java.util.ArrayList;
import java.util.List;

public class ArraySelector {
    public String selectEvens(int[] numbs) {
        String n = "";
        if (numbs.length > 0){
            n = n +"[";
        }
        for (int i = 0; i < numbs.length; i = i + 2) {
            n = n + numbs[i];
            if (i + 2 < numbs.length) {
                n = n + ", ";
            } else {
                n = n + "]";
            }
        }
        return n;
    }

    }



/* Írj egy olyan metódust az ArraySelector osztályban,
 mely egy kapott tömbből minden második elemet kiválogat,
  és egy szövegként összerak, szögletes zárójelek között!
A páros megállapítása index szerint működik. Azaz az első,
 nulla indexű elem páros, a második, azaz egyes indexű elem páratlan,
  stb.
Ha nulla elemű a tömb, akkor üres stringet adjon vissza!*/