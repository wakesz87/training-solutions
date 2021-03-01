//Írj egy számkitaláló programot a GuessTheNumber osztályba!
// A program kitalál egy véletlenszerű számot 1 és 100 között.
// Majd bekér a felhasználótól ciklusban számokat.
// Mindig megmondja, hogy a szám, kisebb, nagyobb vagy egyenlő-e mint a gondolt szám.
//Bónusz feladat: max 6-szor lehet kérdezni!

package week04d03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random rnd = new Random();
        int randomNumb = rnd.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        //System.out.println(randomNumb);
        boolean ok = false;
        int round = 0;
        while(!ok && round <= 6){
            System.out.println("Please give the number");
            int number = Integer.parseInt(sc.nextLine());
            if(number > randomNumb){
                System.out.println("smaller");
            }else if (number < randomNumb){
                System.out.println("bigger");
            }else {
                System.out.println("Match");
                ok = true;
            }
        }
    }
}

//* public static void main(String[] args) {
//
//        Random random = new Random();
//        Scanner scanner = new Scanner(System.in);
//
//        int r = random.nextInt(100) + 1;
//        System.out.println("Gondoltam egy számra 1 és 100 között. Találja ki a számot!");
//        int a = scanner.nextInt();
//
//        while (a != r) {
//            if (a > r) {
//                System.out.println("Ez a szám nagyobb, mint a gondolt szám.");
//                System.out.println("Adjon meg egy másik számot!");
//                a = scanner.nextInt();
//            } else if (a < r) {
//                System.out.println("Ez a szám kisebb, mint a gondolt szám.");
//                System.out.println("Adjon meg egy másik számot!");
//                a = scanner.nextInt();
//            }
//        }
//
//        if (a == r) {
//        System.out.println("Igen, erre a számra gondoltam!");
//    }
//
//    }
//}
