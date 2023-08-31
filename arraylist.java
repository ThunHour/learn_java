import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class arraylist {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner scanner =new Scanner(System.in);
        int i=0;
        while(i<5) {
            System.out.print("Enter a number :");
            int num_1=scanner.nextInt();
                list.add(num_1);
                i++;
        }
        Collections.sort(list);
        System.out.println("Array :"+list);
        System.out.println("Bigger Number:"+list.get(list.size()-1));
    }
}
