package classstructureio;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        String message = "Please enter two numbers!";
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        int elsoSzam = scanner.nextInt();
        int masodikSzam = scanner.nextInt();
        System.out.println(elsoSzam+ "+" +masodikSzam);
        System.out.println(elsoSzam + masodikSzam);


    }
    }

