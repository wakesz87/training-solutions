package week04;

import java.util.Arrays;
import java.util.List;

public class DebugMain {

    public int find(List<String> words, String firstChar) {
        int count = 0;

        for (String word :words) {

            if (word.toLowerCase().startsWith(firstChar)){
                count ++;
            }
        }
        return  count;

    }

    public static void main(String[] args) {
        int count = new DebugMain().find(Arrays.asList("Aone", "atwo", "three", "onehundred"), "a");
        System.out.println(count);
    }

}

