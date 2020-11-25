package week05d03;



import java.util.Arrays;
import java.util.List;

public class ListCounter {
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
        int count = new ListCounter().find(Arrays.asList("Alma", "körte", "banán", "ananász"), "a");
        System.out.println(count);
    }

}







