import java.util.Scanner;
public class binary{
    public static void main(String[] args) {
        int[] arr =new int[5];
        for (int i=0; i<5; i++) {
            arr[i]=2*i;
        }
        int low=0;
        int high=4;
        int mid;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a even number that you want search:");
        int n=scan.nextInt();
        while (low<=high) {
        
            mid=(low+high)/2;
            if (arr[mid]==n){
                System.out.println("Value is found at index "+mid);
                break;
            }
            else if (arr[mid]>n){
                low=mid-1;
            }
            else if (arr[mid]<n){
                low=mid+1;
            }
        }
        if (low>high){
        System.out.println("Valus is not found at index");
    }    
    }
}