import java.util.*;
public class set{
    public static void main(String[] args) {
        int count[]={34,22,10,60,30,22};
        Set<Integer> set = new HashSet<Integer>();
        try {
            for (int i=0; i<count.length; i++){
                set.add(count[i]);
            }
            System.out.println(set);
            TreeSet<Integer> sorted = new TreeSet<Integer>(set);
            System.out.println(sorted);
            System.out.println("The set size is:"+set.size());
            set.remove(34);
            
            System.out.println("The set size is:"+set.size());
            System.out.println("The first element of set is:"+(Integer)sorted.first());
            System.out.println("The Last element of set is:"+(Integer)sorted.last());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}