import java.util.Arrays;
public class bubble_sort{
    public static void main(String[] args) {
        int [] arr={12,33,11,32,83,1,4,6,15,19,30,1,2};
        int[] x=bubble_sort.bubble(arr);
        System.out.println(Arrays.toString(x));

    }
    static int[] bubble(int[] arr) {
        for(int i=arr.length-1; i>=0; i--){
            for(int j=0; j<i;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}