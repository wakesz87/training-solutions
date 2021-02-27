//*Írj egy Phone oszályt, melynek van egy prefix és egy number String attribútuma!
// Írj egy PhoneParser osztályt egy parse(String) metódussal, ami beolvas egy 10-1234567 formátumú szöveget,
// és visszaad egy Phone objektumot, feltöltve a prefix értékét 10, a number értékét 1234567 értékekkel!
package week03d04;

public class PhoneParse {

    public Phone parsePhone(String a) {
        String prefix = a.substring(0, 2);
        String number = a.substring(2);
        Phone phone = new Phone(prefix, number);
        return phone;
    }


    public static void main(String[] args) {
        PhoneParse ph = new PhoneParse();
        Phone phone = ph.parsePhone("704780411");
        System.out.println(phone.getPrefix() + "/" + phone.getNumber());
        System.out.println("--------------");
        System.out.println(phone.toString());

    }
}
