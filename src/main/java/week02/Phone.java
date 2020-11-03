package week02;
import java.util.Scanner;

public class Phone {


    String type;
    int mem;

    public Phone(String type, int mem) {
        this.type = type;
        this.mem = mem;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMem() {
        return mem;
    }

    public void setMem(int mem) {
        this.mem = mem;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem az első telefon tipusát");
        String Phone1 = scanner.nextLine();
        System.out.println("Kérem az első telefon memóriáját");
        int mem1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Kérem a második telefon típusát");
        String Phone2 = scanner.nextLine();
        System.out.println("Kérem amásodik telefon memóriáját");
        int mem2 = scanner.nextInt();

        System.out.println("Az első telefon típusa :  " + Phone1 + "  memóriája  " + mem1);
        System.out.println("A második telefon típusa :  " + Phone2 + "  memóriája  " +mem2);



    }
}
