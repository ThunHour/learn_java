public class merge_sort
{

  public static void main(String[] args)
  {
    int[] array = new int[]{60, 23, 7, 0, 4, 14, -4};
    Sort(array, 0, array.length-1);
    //function call

    //
    
    //print sorted array
    for (int i=0;  i < array.length; i++)
    {
      System.out.println(array[i] + " ");
    }
  }  
  
  public static void Sort(int[] list, int lowindex, int highindex)
  {
    //if there is one number in the array
    if (lowindex == highindex)
    {
      return;
    }
    else 
    {
      int midindex = ((lowindex + highindex)/2);
      
      //recursive call with both sides of the array
      Sort(list, lowindex, midindex);
      Sort(list, (midindex+1), highindex);
      
      //merge the two sides together
      Merge(list, lowindex, midindex, highindex);
    }
  }
  
  public static void Merge(int[] array, int low, int mid, int high)
  {
    //declare 2 new arrays
    int leftarray[]= new int[mid - low + 1];
    int rightarray[] = new int[high - mid];
    
    //put the left side into an array
    for(int i=0; i<leftarray.length; i++)
    {
      leftarray[i] = array[low + i];
    }
    //put the right side into an array
    for(int i=0; i<rightarray.length; i++)
    {
      rightarray[i] = array[mid + i + 1];
    }
    
    
    //declare indexes for the two new arrays
    //start at index 0
    int leftindex = 0;
    int rightindex = 0;
    
    
    //
    for (int i = low; i < high + 1; i++)
    {
      //when there is still elements in both arrays
      if((leftindex < leftarray.length) && (rightindex < rightarray.length))
      { 
        //compare the elements
        //add the number from the left array
        if(leftarray[leftindex] < rightarray[rightindex])
        {
          array[i]= leftarray[leftindex];
          leftindex++;
        }
        else
        //add the number from the right array
        {
          array[i] = rightarray[rightindex];
          rightindex++;
        }
      }
      //if there are remaining numbers in the left array
      else if(leftindex < leftarray.length)
      {
        array[i] = leftarray[leftindex];
        leftindex++;
      }
      //if there are remaining numbers in the right array
      else if(rightindex < rightarray.length)
      {
        array[i] = rightarray[rightindex];
        rightindex++;
      }
    }
  }
  
  //
}