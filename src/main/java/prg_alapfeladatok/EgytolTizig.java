package prg_alapfeladatok;

import java.util.Scanner;

public class EgytolTizig {
    /*1. Írj programot, ami kiírja a képernyőre, hogy ”Hello world!”!
    public static void main(String[] args) {
      System.out.println("Hello World");
    }*/


    /*2. Írj programot, beolvassa a felhasználó nevét, majd köszön neki!
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        String prefix = "Hello ";
        System.out.println(prefix + name +  "!");
    }*/

    /*3. Írj programot, ami beolvas egy számot, majd kiírja a kétszeresét!
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add your number");
        int n = sc.nextInt();
        int n2 = n * 2 ;
        System.out.println("Your number: " + n + " double the number " + n2 );
    }*/

   /* 4. Írj programot, ami beolvas két számot, majd kiírja:
    a. az összegüket;
    b. különbségüket;
    c. szorzatukat;
    d. hányadosukat, ha lehet!

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add your first number");
        int n = sc.nextInt();
        System.out.println("Add your second number");
        int n2 = sc.nextInt();
        System.out.println(n+n2);
        System.out.println(n-n2);
        System.out.println(n*n2);
        System.out.println(n/n2);
        System.out.println(n%n2);
       }*/

    /* 5. Írj programot, mely beolvas két egész számot, és kiírja a képernyőre a
     nagyobbikat!
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add your first number");
        int n = sc.nextInt();
        System.out.println("Add your second number");
        int n2 = sc.nextInt();
        if (n > n2) {
            System.out.println("A nagyobb szám: " + n);
        } else {
            System.out.println("A nagyobb szám: " + n2);
        }


    }*/
    /*6. Írj programot, mely beolvas három egész számot, és kiírja a képernyőre a
    legkisebbet!
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add your first number");
        int n = sc.nextInt();
        System.out.println("Add your second number");
        int n2 = sc.nextInt();
        System.out.println("Add your third number");
        int n3 = sc.nextInt();
        if( n > n2 &&  n > n3){
            System.out.println("A legnagyobb szám: " + n);
        }
        if( n2 > n &&  n2 > n3){
            System.out.println("A legnagyobb szám: " + n2);
        }
        if( n3 > n &&  n3 > n2){
            System.out.println("A legnagyobb szám: " + n3
            );
        }

        }*/
      /* 7. Írj programot, ami beolvassa a háromszög oldalainak hosszát, és megmondja, hogy
       ilyen oldalakkal szerkeszthető-e háromszög!*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("side1");
        int a = sc.nextInt();
        System.out.println("side2");
        int b = sc.nextInt();
        System.out.println("side3");
        int c = sc.nextInt();
    //    System.out.println("Valid " +  isvalid );

    }
    public   boolean isValid(int a, int b, int c ){
        return (a +b > c && b + c > a && c+ a >b);
    }

}



