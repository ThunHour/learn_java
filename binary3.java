import java.util.Scanner;
public class binary3 {
	public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
		int number =scanner.nextInt();
		int[] array = new int[10];
		
		int l = 0;
		int h = 9;
		int index;
		
		//fill the array with even numbers
		for (int i=0; i<10; i++)
		{
			array[i] = 2*i;
		}
		
		index = binarysearch(number, array, l, h);
		
		if(index == -1)
		{ 
			System.out.println("Value is not found");
		}
		else
		{
			System.out.println("Value is found at index " + index);
			System.out.println("Value is " + array[index]);
		}		
	}
		
		
	static int binarysearch(int n, int[] arr, int low, int high)
	{
		if(low > high)
		{
			return -1;
		}
		int mid = ((low + high)/2);;
			
		if (arr[mid] == n)
		{
			return mid;
		}
		else if (arr[mid] > n)
		{
			
			return binarysearch(n, arr, low, mid-1);
		}
		else
		{

			return binarysearch(n, arr, mid+1, high);
		}
		
		
	}
}
