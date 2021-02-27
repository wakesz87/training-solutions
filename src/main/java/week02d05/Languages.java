package week02d05;

import java.util.ArrayList;
import java.util.List;

public class Languages {

    public static void main(String[] args) {
        List<String> progLang = new ArrayList<>();
        progLang.add("Java");
        progLang.add("Python");
        progLang.add("JavaScript");
        progLang.add("C++");

        for(String longName : progLang){
          if(longName.length() > 5){
              System.out.println(longName);
          }

        }
    }
}
