import java.util.Scanner;

public class sum_prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number number 1:");
        int number1 = scanner.nextInt();
        System.out.print("Enter number number 2:");
        int number2 = scanner.nextInt();
        boolean checkNumber1 = checkprime(number1);
        boolean checkNumber2 = checkprime(number2);

        if (checkNumber1 == true && checkNumber2 == true) {
            int total = number1 + number2;
            System.out.println(String.format("both of number are prime and this is the total sum:%d", total));
        } else if (checkNumber1 == true && checkNumber2 == false) {
            System.out.println(String.format("Second number is not prime"));
        } else if (checkNumber1 == false && checkNumber2 == true) {
            System.out.println(String.format("frist number is not prime"));
        }
    }

    public static boolean checkprime(int number) {
        int time = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                time++;
            }
        }
        if (time < 2) {
            return true;
        } else {
            return false;
        }

    }
}
