interface  sayableALot {
    void say();
}
public class methodReference {
    public static void saySomething() {
        System.out.println("This is a staic method");
    }
    public static void main(String[] args) {
        sayableALot s1=methodReference :: saySomething;
        s1.say();
    }
}
