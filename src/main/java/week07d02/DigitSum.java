package week07d02;

public class DigitSum {



    public static int sumOfDigits(int x){
        x = Math.abs(x);
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }

    }
