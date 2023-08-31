import java.util.*;

public class final_project {
    public static void main(String[] args) {
        System.out.println(
                "Welcome to Guessing number game!! \nYou have only 10 chances. Do you want to play Y(yes)/ N(no) ?");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your answer :");
        String answer = input.next();
        while (true) {
            int chances = 10;
            int counter = 1;
            if (answer.equals("yes") || answer.equals("y") || answer.equals("Y") ||
                    answer.equals("Yes")
                    || answer.equals("YES")) {
                System.out
                        .println("I have a number in mind (1 to 100) you have maximum 10 attempts to guess the number");
                int max = 100;
                int min = 1;
                int ran = (int) (Math.random() * ((max - min + 1) + min));
                while (counter <= chances) {
                    System.out.print(String.format("%d.Enter guess number:", counter));
                    int num = input.nextInt();
                    if (num == ran) {
                        System.out.println("\nCongratulation you did it! \nYou are awesome!");
                        break;
                    } else if (num > ran) {
                        System.out.println("Your number is higher then answer!!\n");
                    } else if (num < ran) {
                        System.out.println("Your number is lower then answer!!\n");
                    }
                    counter += 1;
                }

            } else if (answer.equals("N") || answer.equals("n") || answer.equals("NO") ||
                    answer.equals("no")
                    || answer.equals("No")) {
                System.out.println("May you win if you try. Anyway thank you !!");
                break;
            }
            System.out.println("Do you want to restart the game? \nY(yes)/ N(no):");
            String lastAnswer = input.next();
            if (lastAnswer.equals("yes") || lastAnswer.equals("y") || lastAnswer.equals("Y") ||
                    lastAnswer.equals("Yes")
                    || lastAnswer.equals("YES")) {
                continue;
            } else if (lastAnswer.equals("N") || lastAnswer.equals("n") || lastAnswer.equals("NO") ||
                    lastAnswer.equals("no")
                    || lastAnswer.equals("No")) {
                System.out.println("Thank you!");
                break;
            }
        }

    }
}

