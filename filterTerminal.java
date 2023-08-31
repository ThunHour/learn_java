import java.util.*;
import java.util.stream.*;
public class filterTerminal {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Rith","Kimhour","China","Seiha","Kimhuy");
        List<String> result =name.stream().filter(s->s.contains("a")).collect(Collectors.toList());
        System.out.println(result);
    }
}
