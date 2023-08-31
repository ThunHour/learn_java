import java.util.*;
import java.util.stream.Collectors;


public class exercise_3 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3,5,12,11,9,4,22,32);

        List<Integer> square = numbers.stream().map(x->x*x).collect(Collectors.toList());

        System.out.println(square);
        
        
        int sum = numbers.stream()
            .filter(n -> n % 2  == 1).
            reduce(0, Integer::sum);
    
        System.out.println("Sum of odd number: " + sum);

    }
}
