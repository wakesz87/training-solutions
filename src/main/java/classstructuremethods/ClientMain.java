package classstructuremethods;

public class ClientMain {

    public static void main(String[] args) {
        Client client = new Client();

        client.setName("Kiss Szabolcs");
        client.setYear(1987);
        client.setAddress("6600 Szentes kossuth 19");

        System.out.println("Name: " + client.getName());
        System.out.println("Address: " + client.getAddress());
        System.out.println("Year of birth: " + client.getYear());

        client.migrate("6000 Kecskemét vitéz u. 6");

        System.out.println("New Address: " + client.getAddress());
    }
}
