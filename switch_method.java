import java.util.Scanner;

public class switch_method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number 1:");
        int number1 = scanner.nextInt();
        System.out.print("Enter a number 2:");
        int number2 = scanner.nextInt();
        System.out.println("1 for add");
        System.out.println("2 for substract");
        System.out.println("3 for mutiple");
        System.out.println("4 for divaistion");
        System.out.print("Enter your choice:");
        int choice = scanner.nextInt();
        
        switch(choice){
            case 1:
            {
                System.out.println("Total:"+(number1+number2));
                break;
            }
            case 2:
            {
                System.out.println("Total:"+(number1-number2));
                break;
            }
            case 3:
            {
                System.out.println("Total:"+(number1*number2));
                break;
            }
            case 4:
            {
                System.out.println("Total:"+(number1/number2));
                break;
            }

        }

    }
}
