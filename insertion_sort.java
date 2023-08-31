import java.util.Arrays;
public class insertion_sort {
    public static void main(String[] args) {
        int[] array={31,11,22,9,99,12};
        int[] sort=insertion(array);
        System.out.println(Arrays.toString(sort));
    }

    public static int[] insertion(int[] arr){
        for(int i=1; i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    j--;
                }
            }
            return arr;
        }

        
    }

