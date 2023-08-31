import java.util.*;
public class reduceTerminal {
    public static void main(String[] args) {
        List<Integer>numberList=Arrays.asList(2,3,4,5);
        int even=numberList.stream().filter(x->x%2==0).reduce(0,(ans,i)->ans+i);
        System.out.println("even: " + even);
    }
}
