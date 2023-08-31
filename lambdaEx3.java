import java.util.Scanner;
interface calc{
    int calculate(int a,int b);
}
public class lambdaEx3 {
    public static void main(String[] args) {
        // Addable add1=(a,b)->(a+b);
        // System.out.println("ADD:"+add1.add(200, 300));

        // Addable add2=(int a,int b)->(a+b);

        // System.out.println("ADD:"+add2.add(200, 500));

        // Addable multi=(int a,int b)->(a*b);

        // System.out.println("Multi:"+multi.add(200,200));

        // Addable device=(int a,int b)->(a/b);

        // System.out.println("Device:"+device.add(100,10));

        // Addable sub=(int a,int b)->(a-b);

        // System.out.println("Sub:"+sub.add(500,100));

        calc a1;
        int ch;
        int x;
        int y;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value x: ");
        x = input.nextInt();
        System.out.print("Enter the value y: ");

        y = input.nextInt();

        do{

            System.out.println("1.Addition");
            System.out.println("2.Substraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Diviatation");

            System.out.println("Choose your choice: ");

            ch = input.nextInt();
            switch(ch){

                case 1:
                    a1 = (a,b) -> (a+b);
                    System.out.println(a1.calculate(x,y));
                    break;
                
                case 2:
                    a1 = (a,b) ->(a-b);
                    System.out.println(a1.calculate(x,y));
                    break;
                
                case 3:
                    a1 = (a,b) ->(a*b);
                    System.out.println(a1.calculate(x,y));
                    break;

                case 4:
                    a1 = (a,b) ->(a/b);
                    System.out.println(a1.calculate(x,y));
                    break;
            }
        }
        while(ch!=5);
    }
}
