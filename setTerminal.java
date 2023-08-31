import java.util.*;
import java.util.stream.*;

public class setTerminal {
    public static void main(String[] args) {
        int count[] = { 32, 22, 10, 60, 30, 22 };
        Set<Integer> set = new HashSet<Integer>(); 

        for (int i = 0; i < 5; i++) {
            set.add(count[i]);
        }
        set.stream().map(x -> x * x).forEach(y -> System.out.println(y));
        Set<Integer> cube = set.stream().map(x -> x * x * x).collect(Collectors.toSet());
        System.out.println(cube);

    }
}
