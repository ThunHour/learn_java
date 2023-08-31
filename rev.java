import java.util.Scanner;
public class rev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number");
        int num=scanner.nextInt();
        int rem;
        while (num!=0){
            rem=num%10;
            System.out.print(rem);
            
            num=num/10;
        }
    }
}