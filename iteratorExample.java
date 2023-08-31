import java.util.*;
public class iteratorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("java");
        list.add("Python");
        list.add("C#");
        list.add("CPP");
        list.add("NodeJs");
        list.add("javaScript");
        Iterator<String> iterator =list.iterator();
        int x=1;
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(String.format("%s. : %s" ,x, element));
            x++;
        }
    }
}
