import java.util.Scanner;
public class inputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scan=scanner.nextInt();
        if (scan %2==0)
        System.out.println("even");
        else
        System.out.println("odd");
    }
}