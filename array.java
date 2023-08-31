import java.util.Arrays;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        // int[] array = {22,33,12};
        // System.out.println(Arrays.toString(array));
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
    
}
