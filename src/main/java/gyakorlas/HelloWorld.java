package gyakorlas;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     /*   String uzenet = "world is mine";
        System.out.println(uzenet);

        System.out.println("Add meg a neved");
        String nev = scanner.nextLine();
        System.out.println("Hello " + nev);
        System.out.println("Add meg a születési időd");
        int szuletesiEv = scanner.nextInt();
        System.out.println("Ebben az évben született " + szuletesiEv);
        System.out.println("Az ön neve és születési éve " + nev +  " , " + szuletesiEv);
        System.out.println(2020 -szuletesiEv + "  Ön ennyi idős"); */

        System.out.println("kérem adjon meg két számot");
        System.out.println("Első szám");
        int a = scanner.nextInt();
        System.out.println("Második szám");
        int b = scanner.nextInt();
        System.out.println("A két szám értéke " + a +  "+" +  b);
        System.out.println("A két szám összege "+ (a+b)+"!");
       scanner.nextLine();

        System.out.println("Adja meg a nevet:");
        String nev = scanner.nextLine();

        System.out.println("Adja meg az e-mail cimet:");
        String email = scanner.nextLine();
        System.out.println("Az ön neve: " + nev + " az ön email cime: " + email);







    }
}

