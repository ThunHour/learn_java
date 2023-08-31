import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class demoTerminal {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2, 3, 7, 5);
        //using map
        // List<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toList());

        //using forEach
        // number.stream().map(x -> x * x).forEach(x -> System.out.println(x));;

        // System.out.println(square);
    }
}