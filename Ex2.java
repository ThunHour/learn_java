import java.util.function.BiFunction;

class Arithmetic {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }
    public static int mul(int a, int b) {
return a*b;
    }
}

public class Ex2 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> added = Arithmetic::add;

        int result = added.apply(10, 20);

        System.out.println("result add: " + result);

        added = Arithmetic::sub;

        int resultSub = added.apply(10, 20);

        System.out.println("result sub: " + resultSub);
    }
}
