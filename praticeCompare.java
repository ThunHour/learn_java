import java.util.*;

class Employee {
    private int id, age, salary;
    private String name, department;

    public Employee(int ids, int ages, int salarys, String names, String departments) {
        this.id = ids;
        this.age = ages;
        this.name = names;
        this.salary = salarys;
        this.department = departments;
    }

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}

class EmName implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }
}

public class praticeCompare {
    public static void main(String[] args) {
        ArrayList<Employee> em=new ArrayList<Employee>();
        //int ids, int ages, int salarys, String names, String departments
        em.add(new Employee(10,19,5000,"Seak kimhour","IT"));
        em.add(new Employee(11,20,3000,"Srun china"," Finance"));
        em.add(new Employee(12,21,4000,"Hout monirith","Human Resource"));
        em.add(new Employee(13,20,2500,"Bou Leapheng","Marketing"));
        em.add(new Employee(14,19,2000,"Hai Seanghor"," Operations management"));
        EmName ename=new EmName();
        Collections.sort(em, ename);
        for(Employee employee:em){
            System.out.println(
String.format("Id:%d , Name:%s , Salary:%d , Age:%d , Department:%s", employee.getId(), employee.getName(), employee.getSalary(),employee.getAge(),employee.getDepartment()));
        }
    }
}
