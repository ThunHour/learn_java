import java.util.Scanner;
import java.util.Arrays;

public class bbSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length of Array:");
        int len = scan.nextInt();
        int arr[] = new int[len];

        for (int i = 0; i < len; i++) {
            System.out.print("Enter a Number:");
            arr[i] = scan.nextInt();
        }
        int[] sorted = sort(arr);
        System.out.println(String.format("Your sorted array ==> %s", Arrays.toString(sorted)));
        

    }


    static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp1 = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp1;
                }
            }

        }
        return arr;
    }

}
