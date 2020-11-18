package week04;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {
    public static void main(String[] args) {
        int numb = new Random().nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println(numb);
        boolean ok = false;
        int round = 0;
        while (!ok && round<=6){
            System.out.println("kérek egy számot");
            int guessed=Integer.parseInt(scanner.nextLine());
            if(guessed>numb){
                System.out.println("kisebb");
            } else if(guessed<numb){
                System.out.println("nagyobb");
            }else{
                System.out.println("Talált");
                ok=true;
            }
        }

    }
}
