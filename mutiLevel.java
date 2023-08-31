class hod {
    String course = "Software Engineering";
}

class teachers extends hod {
    String course = "data structures";

    void display() {
        System.out.println(course);
        System.out.println(super.course);
    }
}

class students extends teachers {
    String course = "Java";

    void display() {
        System.out.println(course);
        System.out.println(super.course);
    }
}


public class mutiLevel {

    public static void main(String[] args) {


        teachers teacher = new teachers();
        teacher.display();

        students student = new students();
        student.display();


    }
}