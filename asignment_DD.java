import java.util.Scanner;
public class asignment_DD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter amountDD:");
        int amountDD = scan.nextInt();
        if (amountDD < 501 && amountDD > -1) {
            System.out.print(String.format("Total amount:%d", amountDD + 10));
        } else if (amountDD > 500 && amountDD < 1001) {
            System.out.print(String.format("Total amount:%d", amountDD + 15));
        } else if (amountDD > 1000 && amountDD < 5001) {
            System.out.print(String.format("Total amount:%d", amountDD + 20));
        } else if (amountDD > 5000 && amountDD < 10001) {
            System.out.print(String.format("Total amount:%d", amountDD + 25));
        } else if (amountDD > 10000) {
            double commission = 25 + ((amountDD - 10000)*0.004);
            if (commission <= 1500) {
                System.out.print(String.format("Total commission:%.2f", amountDD+commission));
            } 
            else if (commission > 1500) {
                System.out.println("DD cannot be taken.");
            } 

        }
    }
}
