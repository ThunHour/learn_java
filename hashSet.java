import java.util.*;
public class hashSet {
    public static void main(String[] args) {
        Set<String> h = new HashSet<String>();
        h.add("Cambodia");
        h.add("China");
        h.add("Japan");
        h.add("Thailand");
        h.add("cambodia");
        System.out.println(h);
        System.out.println("size: "+h.size());
        h.remove("Cambodia");
        System.out.println("size: "+h.size());
        System.out.println("contains india : "+h.contains("india"));
    }
}
