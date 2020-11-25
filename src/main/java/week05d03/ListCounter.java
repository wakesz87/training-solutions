package week05d03;

import java.util.Arrays;
import java.util.List;

public class ListCounter {
    public int counterVowels(List<String> list) {
        int words = 0;
        for (String w:list) {
            String character =w.toLowerCase().substring(0, 1);
            if (character.equals("a")) {
                words++;
            }
        }
        return words;
    }

    public static void main(String[] args) {

    }
}







