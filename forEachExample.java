import java.util.*;
public class forEachExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("Hour");

        list.add("Rith");

        list.add("China");

        list.add("Seiha");

        list.add("Sovann");

        list.add("Koji");

        list.forEach(

            (element)->{

                System.out.println(element);
                
            }
        );
    }
}
