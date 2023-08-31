import java.util.Scanner;
public class even_odd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int no = scanner.nextInt();
        if (no%2==0)
        System.out.println("even :"+no);
        else
            System.out.println("Odd :"+no);
    }
}
