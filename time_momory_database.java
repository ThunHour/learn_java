import java.util.Scanner;
public class time_momory_database {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        try (Scanner scanner = new Scanner(System.in)) {
            String[][] database = new String[3][3];
            for (int i = 0; i < 3; i++) {
                System.out.print("Enter a name:");

                String name = scanner.nextLine();

                System.out.print("Enter date of birth:");

                String date = scanner.nextLine();

                System.out.print("Enter place of birth:");

                String place = scanner.nextLine();

                database[i][0]=name;
                database[i][1]=date;
                database[i][2]=place;
            }
            System.out.print("Enter a name want to search:");
            String search=scanner.nextLine();
            for (int j = 0; j < 3; j++) {
                if (database[j][0].equals(search)){
                    System.out.println(String.format("My name is %s , I was born in %s since %s",database[j][0],database[j][2],database[j][1]));
                                                    }
                }
        }

        long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
            long actualMemUsed=afterUsedMem-beforeUsedMem;

            long finish = System.currentTimeMillis();
            long timeElapsed = finish - start;
            System.out.println("time:"+timeElapsed);
            System.out.println(actualMemUsed);
    
  }
}
