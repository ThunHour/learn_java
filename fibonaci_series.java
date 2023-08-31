import java.util.Scanner;
import java.util.Arrays;
public class fibonaci_series {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number of sequences:");
        int sqe = scan.nextInt();
        int[] array = new int[sqe];
        int x1=0;
        int  x2=1;
        int x3=0;
        for (int i=0; i<sqe; i++) {
            x3=x1+x2;
            array[i]=x3;
            System.out.println(x3);
            x1=x2;
            x2=x3;
        }
        System.out.println(String.format("Here are all of your number:%S", Arrays.toString(array)));
    }
}
