package statements;

import java.util.Scanner;

public class InvestmentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("befektetés összege");
        int amount = scanner.nextInt();
        System.out.println("kamatláb");
        int interestRate = scanner.nextInt();

        Investment investment = new Investment(amount, interestRate);
        System.out.println("tőke" + investment.getFund());
        System.out.println("hozzam 50 napra " + investment.getYield(50) );
        System.out.println("Kivett összeg 80 nap után " + investment.close(80));
        System.out.println("Kivett összeg 90 nap után " + investment.close(90));
    }
}
