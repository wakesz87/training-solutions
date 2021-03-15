package attributes.person;

public class PersonMain {
    public static void main(String[] args) {
        Person p = new Person("John Doe", "121212WQ");
        Address ad = new Address("Magyarország", "Pécs", "Dankó Pista u 12.", "2000");

        System.out.println(p.personToString());
        System.out.println(ad.addressToString());

        ad.correctData("Magyarország", "Budapest", "Kossuth u. 56", "1014");
        p.moveTo(ad);
        System.out.println(p.getAddress().addressToString());

        String newCountry = "Vatikán";
        String newCity = "Vatikánia";
        String newStreetAndNumber = "Páoa u 72.";
        String newZipCode = "0000";

        ad.correctData(newCountry, newCity, newStreetAndNumber, newZipCode);
        p.moveTo(ad);
        System.out.println(p.getAddress().addressToString());


    }
}
