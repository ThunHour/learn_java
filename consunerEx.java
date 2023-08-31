import java.util.function.Consumer;

public class consunerEx {
    public static void main(String[] args) {
        Consumer<String> consumer =(x)->System.out.println(x);

        consumer.accept("hello bro ");
    }
}
