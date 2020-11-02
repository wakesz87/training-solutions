package classstructureio;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        String message = "Please enter two numbers!";
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        System.out.println("First Number : ");
        int elsoSzam = scanner.nextInt();
        System.out.println("Second Number:");
        int masodikSzam = scanner.nextInt();
        System.out.println(elsoSzam+  "+"  +masodikSzam);
        System.out.println(elsoSzam + masodikSzam);


    }
    }

