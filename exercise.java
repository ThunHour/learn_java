import java.util.*;
import java.util.stream.*;
class employees{
    int eId,eSalary;
    String eName,eDept;
    employees(int eId,String eName,String eDept,int eSalary){
        this.eId = eId;
        this.eSalary = eSalary;
        this.eName = eName;
        this.eDept = eDept;
    }
}
public class exercise{
    public static void main(String[] args) {
        List<employees> listEm=new ArrayList<employees>();
        listEm.add(new employees (1, "Monirith", "Mobile developer", 2000));
        listEm.add(new employees (2, "China", "Testing developer", 500));
        listEm.add(new employees (3, "Kimhour", "Backend developer", 2000));
        listEm.add(new employees (4, "Cheoumren", "Mobile developer", 200));
        listEm.add(new employees (5, "Leapheng", "Network administrator", 1000));
        listEm.add(new employees (6, "Dom", "Mobile developer", 1400));
        listEm.add(new employees (7, "Somnang", "Mobile developer", 300));
        listEm.add(new employees (8, "Chantra", "Mobile developer", 1450));

        listEm.stream().filter(x->x.eSalary>500).map(x->String.format("Id : %d    Name : %s    Dept : %s    Salary : %d",x.eId,x.eName,x.eDept,x.eSalary)).forEach(x->System.out.println(x));;

    }
}