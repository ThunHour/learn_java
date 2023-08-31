import java.util.Scanner;
public class dimension_array{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter rows:");

        int rows=input.nextInt();

        System.out.print("Enter columns:");

        int columns=input.nextInt();

        String[][] arr2d=new String[rows][columns];

        for (int i=0; i<columns; i++) {
            for (int j=0; j<rows; j++) {
                System.out.print("Enter a element in array:");
                arr2d[i][j]=input.nextLine();
            }
        }
        for (int i=0; i<rows; i++) {
            for (int j=0; j<columns; j++) {
                System.out.println(arr2d[i][j]);
            }
        }

    }
}