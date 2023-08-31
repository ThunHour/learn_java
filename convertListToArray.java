import java.util.*;
public class convertListToArray {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        // Adding elements in the List
        list1.add("Mango");
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Grapes");
        System.out.println(list1);
        for (String fruit:list1) 
            System.out.println(fruit);
        String[] arr=list1.toArray(new String[list1.size()]);
        System.out.println(Arrays.toString(arr));
    }
}
