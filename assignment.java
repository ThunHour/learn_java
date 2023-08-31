import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.next();
        System.out.print("Enter number of your account: ");
        int accountId = scan.nextInt();
        System.out.print("Enter Your balance: ");
        int balance = scan.nextInt();
        if (balance > 50000) {
            balance += 2000;
            System.out.println(
                    String.format("Account name %s ,AccountID:%d, Accountbalance:%d", name, accountId, balance));
        } else if (balance < 5000) {
            System.out.println(
                    String.format("Account name %s ,AccountID:%d, Your balance is less then 5000", name, accountId));
        } else {
            System.out.println(
                    String.format("Account name %s ,AccountID:%d, Your balance is less then 50000", name, accountId));
        }
    }

}
