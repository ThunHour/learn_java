
class Employee {

  int employeeid;
  double salary;
  static String ceo;

  static {
    ceo = "larry";
  }

  public Employee() {
    employeeid = 1;
    salary = 1400;
  }

  public Employee(int i) {
    employeeid = i;
    salary = 1500;
    
  }

  public Employee(double j) {
    employeeid = 4;
    salary = j;
  }

  public Employee(int m, int n) {
    employeeid = m;
    salary = n;

  }

  public void show() {
    System.out.println(employeeid + " " + salary + " " + ceo);

  }
}

public class inherithance {
  // static int i = 6;
  // static String ceo = "Larry";

  public static void main(String[] args) {
    int i = 5;
    double j = 1000;

    Employee Peter = new Employee();
    // Peter.employeeid = 7;
    // Peter.salary = 2000;

    Employee Susan = new Employee(i);
    // Susan.employeeid = 9;
    // Susan.salary = 2200;

    Employee Bob = new Employee(j);

    Employee John = new Employee(9, 1600);

    Peter.show();
    Susan.show();
    John.show();
    Bob.show();
  }
}
