package week13d05;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CountVowels {
    public int countDifferentLetters(String word) {
        Set<Character> differentLetters = new TreeSet<>();
        char[] lettersOfWord = word.toLowerCase().toCharArray();
        for (char c : lettersOfWord) {
            if (c >= 'a' && c <= 'z') {
                differentLetters.add(c);
            }
        }
        return differentLetters.size();
    }

    public Map<Character, Integer> countLetters(String word) {
        Map<Character, Integer> lettersOfWord = new TreeMap<>();
        int[] keyAndValue = new int[2];
        char[] letters = word.toLowerCase().toCharArray();
        for (char c : letters) {
            if (c >= 'a' && c <= 'z') {
                keyAndValue = getKeyAndValue(c, lettersOfWord);
                lettersOfWord.put((char)keyAndValue[0], keyAndValue[1]);
            }
        }
        return lettersOfWord;
    }

    private int[] getKeyAndValue(char c, Map<Character, Integer> lettersOfWord) {
        int[] keyAndValue = new int[2];
        if (!lettersOfWord.containsKey(c)) {
            keyAndValue[0] = c;
            keyAndValue[1] = 1;
        }
        if (lettersOfWord.containsKey(c)) {
            int sum = lettersOfWord.get(c) + 1;
            keyAndValue[0] = c;
            keyAndValue[1] = sum;
        }
        return keyAndValue;
    }

    public static void main(String[] args) {
      CountVowels cw = new CountVowels();
        cw.countLetters("Almafa-, Levélbogár");
        System.out.println(cw.countLetters("Apukátkukacát, Megszentségteleníthetetlenségeskedéseimet").keySet().toString());
        System.out.println(cw.countLetters("Apukátkukacát, Megszentségteleníthetetlenségeskedéseimet").entrySet().toString());
    }
}
