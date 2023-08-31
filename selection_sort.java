import java.util.Arrays;
public class selection_sort {
    public static void main(String[] args) {
        int[] arr={2,8,15,1,24,13,4};
        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i]>arr[j]){
                    int temp1=arr[i];
                    int temp2=arr[j];
                    arr[i] = temp2;
                    arr[j] = temp1;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
