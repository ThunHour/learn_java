class Claculator //Super class or parent class
{
    public int add(int num1,int num2)
    {
        return num1+num2;
    }
}
class CaAdv extends Claculator //child class
{
    public int sub(int num1,int num2)
    {
        return num1-num2;
    }
}
public class inheritance
{
    public static void main(String[] args) 
    {
        CaAdv c1=new CaAdv();
        int sum=c1.add(12,20);
        int minor=c1.sub(12,20);
        System.out.println("Total:"+sum);
        System.out.println("Total:"+minor);
    }
}