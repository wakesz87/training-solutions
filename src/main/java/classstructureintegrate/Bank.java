package classstructureintegrate;
import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Account number");
        String accountNumber = scanner.nextLine();
        System.out.println("Account number owner?");
        String owner = scanner.nextLine();

        System.out.println("How much to open the account?");
        int amount = scanner.nextInt();
        scanner.nextLine();
        BankAccount account1 = new BankAccount(accountNumber, owner, amount);

        System.out.println("New Account number");
        String accountNumber2 = scanner.nextLine();

        System.out.println("New Account number owner?");
        String owner2 = scanner.nextLine();

        System.out.println("How much to open the account? ");
        int amount2 = scanner.nextInt();
        BankAccount account2 = new BankAccount(accountNumber2, owner2, amount2);
        System.out.println(account1.getInfo());
        System.out.println(account2.getInfo());

        System.out.println("how much you want to deposit into the first account");
        int depositAmount = scanner.nextInt();
        account1.deposit(depositAmount);
        System.out.println(account1.getInfo());

        System.out.println("how much you want to get from the second account");
        int withdrawAmount = scanner.nextInt();
        account2.withdraw(withdrawAmount);
        System.out.println(account2.getInfo());

        System.out.println("how much you want to transfer from the first account to the second account");
        int transferAmount = scanner.nextInt();
       // account1.transfer(account2, transferAmount);
        System.out.println(account1.getInfo());
        System.out.println(account2.getInfo());
    }
}

