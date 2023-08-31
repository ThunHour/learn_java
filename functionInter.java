interface sayable {

    void say(String msg);

    int hashCode();

    String toString();

    boolean equals(Object obj);
}

public class functionInter {

    public void say(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        functionInter fi = new functionInter();

        fi.say("hello there");
    }

}