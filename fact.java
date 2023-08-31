import java.util.Scanner;
public class fact {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of factories:");
        int sqe=scanner.nextInt();
        int value=1;
        for (int i=0; i<sqe; i++) {
            value=value*i;
        }
        System.out.println(value);
    }
}
