package week02.projektmunka;

import java.util.Scanner;

public class Controller {

    Office office1 = new Office();

    public void readOffice() {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int length;
        int width;

        System.out.println("tárgyalók száma");
        int numb = scanner.nextInt();

        for (int i = 1; i < numb + 1; i++) {
            System.out.println("tárgyaló hossz");
            length = scanner.nextInt();
            scanner.nextLine();
            System.out.println("tárgyaló szélessége");
            width = scanner.nextInt();



            MeetingRoom room = new MeetingRoom(name, width, length);
            office1.addMeetingRoom(room);
        }
    }

    public void printMenu() {
        System.out.println("1-tárgyalók sorrendben");
        System.out.println("2-tárgyalók visszafele sorrendben  ");
        System.out.println("3-minden másddik tárgyaló");
        System.out.println("4-területek");
        System.out.println("5-keresés pontos név alapján");
        System.out.println("6-keresés név töredék alapján");
        System.out.println("7-keresés terület alapján");
    }

    public void  runMenu() {
        Scanner scanner = new Scanner(System.in);
        int data;
        System.out.println("kérem vállasszon a menü pontok közül");
        data = scanner.nextInt();
        scanner.nextLine();
        switch (data) {
            case 1:
                office1.printNames();
            case 2:
                office1.printNamesReverse();
            case 3:
                office1.printEven();
            case 4:
                office1.printAreas();
            case 5:
                System.out.println("a tárgyaló neve");
                 String name = scanner.nextLine();
                office1.printMeetingRoomsName(name);
            case 6:
                System.out.println("a nevének része");
                name= scanner.nextLine();
           office1.printMeetingsRoomContains(name);
            case 7:
                System.out.println("tárgyaló minimum területe");
                int area = scanner.nextInt();
                scanner.nextLine();
                office1.printAreasLarger(area);

        }
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.readOffice();
        controller.printMenu();
        controller.runMenu();

    }
}

