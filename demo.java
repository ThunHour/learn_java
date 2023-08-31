interface maths {
    void square(int a);

    default void show() {
        System.out.println("default method");
    }
}

public class demo implements maths {
    public void square(int a) {
        System.out.println(a * a);
    }

    public static void main(String[] args) {
        maths m1 = new demo();
        m1.square(15);
        m1.show();
    }

}
