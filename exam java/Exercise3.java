import java.util.*;

public class Exercise3 {
    public static void main(String[] args) {
        List<Integer> listInteger = new ArrayList<Integer>();

        // insertion method
        listInteger.add(13);
        listInteger.add(5);
        listInteger.add(40);
        listInteger.add(29);
        listInteger.add(91);
        listInteger.add(7);
        listInteger.add(73);
        System.out.println("List of Integer that added : " + listInteger);

        // deltion method
        listInteger.remove(new Integer(5));
        System.out.println("We remove 5 from the listInteger : " + listInteger);

        // search method
        System.out.println("Let contains 40 in List Integer : " + listInteger.contains(40)); // true
        System.out.println("Let contains 20 in List Integer : " + listInteger.contains(20));

        // sorted
        System.out.println("The Unsorted List of Integer: " + listInteger);

        Collections.sort(listInteger);
        System.out.println("The Sorted List of Integer: " + listInteger);

    }
}
