package week08d05;
/*
A week08d05 csomagban készíts egy osztályt MathAlgorithms néven.
Legyen benne egy metódus, greatestCommonDivisor() , ami paraméterül
vár két pozitív egész számot és visszaadja a legnagyobb közös osztójukat.
 */

import java.util.Scanner;

public class MathAlgorithms {

   public static int  greatestCommonDivisor(int number1, int number2) {
        if(number2 ==0) {
            return number1;
        }
        return greatestCommonDivisor(number2, number1 % number2);

    }

    /*public static void main(String[] args) {
        MathAlgorithms ma = new MathAlgorithms();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg az első számot");
        int number1 = scanner.nextInt();
        System.out.println("Adja meg a második számot");
        int number2 = scanner.nextInt();

        System.out.println("A számok legnagyobb közös osztója: " + "\n"
         + MathAlgorithms.greatestCommonDivisor(number1, number2));
    }*/
}