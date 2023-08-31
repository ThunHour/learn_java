import java.util.*;
public class convertarrayTolist {
    public static void main(String[] args) {
        String[] list = {"hour","china","rith","heng"};
        List<String> lst=new ArrayList<String>(Arrays.asList(list));
        System.out.println(lst);
        
    }
}
