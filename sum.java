import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number");
        int num=scanner.nextInt();
        int rem=0;
        while (num!=0){
            rem+=num%10;
                    
            num=num/10;
                }
        System.out.println(rem);
    }
}
