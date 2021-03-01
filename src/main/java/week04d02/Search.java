//A Search osztályban írj egy getIndexesOfChar() metódust, mely első paraméterként vár egy String értéket,
// második paraméterként egy char értéket! Visszaad egy listát, melyben visszaadja, hogy a karakter
// hanyadik indexeken szerepel az első paraméterként átadott listában.
//Pl.: almafa szóban a a karakter: 0, 3, 5.

package week04d02;

import java.util.ArrayList;
import java.util.List;

public class Search {

  public List<Integer> getIndexesOfChar(String str, char c ) {
      List<Integer>  result= new ArrayList<>();
      for(int i = 0; i <str.length(); i++ ){
          if(str.charAt(i) == c ) {
              result.add(i);
          }
      }
      return  result;

  }

    public static void main(String[] args) {
        Search s = new Search();
        System.out.println(s.getIndexesOfChar("megszentsegtelenithetetlensegesegeim",'e'));
        Search s1 = new Search();
        System.out.println(s1.getIndexesOfChar("TheFirstOrder",'i'));
    }

}
