package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        String message = "Please enter your name and email address";
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name :");
        String name = scanner.nextLine();
        System.out.println("E-mail :");
        String email = scanner.nextLine();
        System.out.println("Your name: " + name );
        System.out.println("Your e-mail: " + email );
    }
}
