package classstructureattributes;
import java.util.Scanner;
public class ClientMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Client client = new Client();

        System.out.println("Please enter your name  , year of birth and address : ");
        System.out.println("Name");
        client.name = scanner.nextLine();
        System.out.println("Year of birth");
        client.year = scanner.nextInt();
        System.out.println("Address");
        client.address = scanner.nextLine();

        System.out.println("Name :" + client.name);
        System.out.println("Year of birth :" + client.year);
        System.out.println("Address" + client.address);
    }
}

