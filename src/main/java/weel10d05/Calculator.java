package weel10d05;

import java.util.Arrays;

public class Calculator {
    int findMinSum(int[] arr){

//Létezik 0 elemű tömb?

        if (arr.length<1) {
            System.out.println("A megadott tömbben nincsenek elemek!");
            return -1;
        }

        Arrays.sort(arr);

        int toSumArrayLength = Math.min(arr.length, 4);
        int summarizedMin = 0;

        for (int i=0; i < toSumArrayLength; i++){
            summarizedMin = summarizedMin + arr[i];
        }

        return summarizedMin;
    }
}
