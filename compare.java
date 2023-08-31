import java.util.Scanner;
public class compare{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        int z=scanner.nextInt();
        if (x>y) {
            if (x>z) 
                System.out.println("The greater number is:"+x);
            else
                System.out.println("The greater number is:"+z);
            
                }
        else if(y>z){
                System.out.println("The greater number is:"+y);
                    }
        else
            System.out.println("The greater number is:"+z);
    }
}