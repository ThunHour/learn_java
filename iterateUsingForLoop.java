import java.util.*;

public class iterateUsingForLoop{
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<String>();
        list.add("kimhour");
        list.add("Rith");
        list.add("China");
        list.add("Leapheng");
        for(String s : list){
            System.out.println(s);
        }
    }
}