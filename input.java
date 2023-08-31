import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner san=new Scanner(System.in);
        int num_1=san.nextInt();
        int num_2=san.nextInt();
        if (num_1>num_2) {

        System.out.println("This is bigher then : "+num_1);
    }
    else{
        System.out.println("This is bigger then : "+num_2);
    }
    
}
}
