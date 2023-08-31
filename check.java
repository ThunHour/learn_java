import java.util.Scanner;
public class check{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int age=scanner.nextInt();
    if (age>=18){
        System.out.println("You can vote");
    }
    else 
        System.out.println("You can not vote because your age is not greater than 18");
}
}