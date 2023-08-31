import java.util.*;

public class Example4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please inpt vote");
        int age = input.nextInt();

        try {
            checkAge(age);
        } catch (ArithmeticException error) {
            System.out.println(error.getMessage());
        }
    }

    static void checkAge(int age) {
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            throw new ArithmeticException("Age is not eligible to vote");
        }
    }
}
