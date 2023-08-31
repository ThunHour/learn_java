import java.io.*;
import java.util.*;

class studentInfor implements Comparable<studentInfor> {
    private int rollno;
    private String name;
    private int age;

    public int compareTo(studentInfor s) {
        return this.age - s.age;
    }

    public studentInfor(String nm, int rollno, int age) {
        this.name = nm;
        this.rollno = rollno;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;
    }
}

public class comparatorable {
    public static void main(String[] args) {
        ArrayList<studentInfor> list = new ArrayList<studentInfor>();
        list.add(new studentInfor("hour",3,22));
        list.add(new studentInfor("rith",7,19));
        list.add(new studentInfor("china",8,18));
        list.add(new studentInfor("seiha",4,17));
        list.add(new studentInfor("heng",9,21));
        Collections.sort(list);
        System.out.println(list);
        for (studentInfor student : list) {
            System.out.println("Name: "+student.getName()+",  Rollno: "+student.getRollno()+",  Age: "+student.getAge());
        }

    }
}
