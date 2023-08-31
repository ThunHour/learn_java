import java.util.Scanner;
public class income_tax {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount of income:");
        int amountIncome = scanner.nextInt();
        if (amountIncome <= 100000) {
            System.out.println("Your total income is under rule tax.");
        } else if (amountIncome > 100000 && amountIncome <= 300000) {
            System.out.println(String.format("Your total income isneed to pay for tax is:%.2f" ,amountIncome * 0.1));
        } else if (amountIncome > 300000 && amountIncome <= 500000) {
            System.out.println(String.format("Your total income isneed to pay for tax is:%.2f" ,amountIncome * 0.2 + 1000));
        } else if (amountIncome > 500000) {
            System.out.println(String.format("Your total income isneed to pay for tax is:%.2f",amountIncome * 0.3 + 2000));
        }

    }
}
