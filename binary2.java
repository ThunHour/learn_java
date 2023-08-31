import java.util.Scanner;
public class binary2 {
  public static void main(String[] args)
  {
    System.out.print("Enter number want to search:");
    Scanner scanner = new Scanner(System.in);
    int number =scanner.nextInt();
    
    int[] array = new int[5];
    //fill the array with even numbers
    for (int i=0; i<5; i++)
    {
      array[i] = 2*i;
    }
    
    binarysearch(number, array);
    
  }
    
    
  static void binarysearch(int n, int[] arr)
  {
    int low = 0;
    int high = 4;
    int mid;
    
    while (low <= high)
    {  
      mid = ((low + high)/2);
      
      if (arr[mid] == n)
      {
        System.out.println("Value is found at index " + mid);
        break;
      }
      else if (arr[mid] > n)
      {
        high = mid - 1;
      }
      else if (arr[mid] < n)
      {
        low = mid + 1;
      }
    }
    
    if(low > high)
    {
      System.out.println("Value is not found");
    }
  }
}
