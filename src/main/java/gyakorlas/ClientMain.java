package gyakorlas;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Client client = new Client();
        System.out.println("kérem adja meg a nevét");
        client.name = scanner.nextLine();
        System.out.println("kérem adja meg a cimet");
        client.address = scanner.nextLine();
        System.out.println("kérem adja meg a születési évét");
        client.year = scanner.nextInt();

        System.out.println("Az ön neve "+ client.name + " , " +  "Az ön címe "+ client.address + " , " +  "Az ön születési éve " + client.year );



    }
}
