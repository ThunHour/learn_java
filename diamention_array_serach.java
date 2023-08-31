import java.util.Scanner;
import java.util.Arrays;
public class diamention_array_serach {
    public static void main(String[] args) {
       
        int row=3;

        int column=3;

        String [][] strarr=new String[row][column];

        strarr[0][0]="hour";
        strarr[0][1]="19";
        strarr[0][2]="SE";

        strarr[1][0]="Seiha";
        strarr[1][1]="20";
        strarr[1][2]="AR";

        strarr[2][0]="Chheang";
        strarr[2][1]="20";
        strarr[2][2]="TM";

        System.out.print("Enter your enter to get your data:");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                if (strarr[i][j].equals(name)){
                    System.out.println(String.format("Your information ==> %s",Arrays.toString(strarr[i])));
                }
            }
        }
    }
}
