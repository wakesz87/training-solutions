package statements;

import java.util.Scanner;

public class timeMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First time _ hour :");
        int fhour = scanner.nextInt();
        System.out.println("First time _ min :");
        int fmin = scanner.nextInt();
        System.out.println("First time _ sec :");
        int fsec = scanner.nextInt();
        System.out.println("Second time _ hour :");
        int shour = scanner.nextInt();
        System.out.println("Second time _ min :");
        int smin = scanner.nextInt();
        System.out.println("Second time _ sec :");
        int ssec = scanner.nextInt();

    Time FirstTime = new Time(fhour, fmin, fsec);
    Time SecondTime = new Time(shour, smin, ssec);
        System.out.println("First time " + FirstTime.toString() + " = " + FirstTime.getInMinutes() + "min") ;
        System.out.println("Second time " + SecondTime.toString() + " = "+ SecondTime.getInSeconds() +"sec");
        System.out.println("First time earlier than Second time: " + FirstTime.earlierThan(SecondTime));

}
}
