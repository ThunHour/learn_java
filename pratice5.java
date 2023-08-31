
import java.util.*;

public class pratice5 {
    public static void main(String[] args) {
        ArrayList<Studentinfo> list = new ArrayList<Studentinfo>();
        list.add(new Studentinfo("Kimhour", 1, 18));
        list.add(new Studentinfo("Monirith", 2, 25));
        list.add(new Studentinfo("Chamroen", 3, 23));
        list.add(new Studentinfo("Leapheng", 4, 55));
        list.add(new Studentinfo("Seanghor", 5, 11));

        Collections.sort(list);
        System.out.println("Students information after sorting: ");

        for (Studentinfo info : list) {
            System.out.println(info.getName() + " " + info.getAge() + " " + info.getRollno());
        }
    }
}

class Studentinfo implements Comparable<Studentinfo> {
    private int rollno;
    private String name;
    private int age;
    
    // contructor
    Studentinfo(String nm, int rollno, int age){
        this.name = nm;
        this.rollno = rollno;
        this.age = age;
    }

    // used to sort students based on age
    public int compareTo(Studentinfo s){
        return this.age - s.age;
    }

    // getter methods for accessing private data
    public int getAge() {
        return age;
    }
    public String getName(){
        return name;
    }
    public int getRollno(){
        return rollno;
    }
}