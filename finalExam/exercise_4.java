import java.util.Scanner;
interface calc{

    int calculate(int a, int b);
}

public class exercise_4 {
    
    public static void main(String[] args) {
        
        calc ans;

        int ch;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value x: ");
        int x = input.nextInt();

        System.out.println("Enter the value y: ");
        int y = input.nextInt();

        do{

            System.out.println("1.Addition");
            System.out.println("2.Substraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Diviatation");

            System.out.println("Choose your choice: ");

            ch = input.nextInt();
            switch(ch){

                case 1:
                    ans = (a,b) -> (a+b); //for (a+b) we can also use return to perform a+b
                    System.out.println("results : " + ans.calculate(x,y));
                    System.out.println("========================");
                    break;
                
                case 2:
                    ans = (a,b) ->(a-b);
                    System.out.println("results : " + ans.calculate(x,y));
                    System.out.println("========================");
                    break;
                
                case 3:
                    ans = (a,b) ->(a*b);
                    System.out.println("results : " + ans.calculate(x,y));
                    System.out.println("========================");
                    break;

                case 4:
                    ans = (a,b) ->(a/b);
                    System.out.println("results : " + ans.calculate(x,y));
                    System.out.println("========================");
                    break;
            }
        }
        while(ch!=5);
        
    }
}