import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class serialization implements Serializable {
    public static void main(String[] args) {
        try {
            //create object student
            Student s1 = new Student(211, "hour");
            //create file
            FileOutputStream fout = new FileOutputStream("f.txt");
            //convert file to object
            ObjectOutputStream out = new ObjectOutputStream(fout);
            //write object student into f.txt file
            
            out.writeObject(s1);
            out.flush();

            System.out.println("Success");

            //deserialization
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("E:\\PycharmProjects\\javaForKIT\\f.txt"));
            Student s = (Student) in.readObject();
            System.out.println("ID :" + s.id + "\n" + "Name: " + s.name);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
