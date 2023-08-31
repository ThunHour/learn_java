import java.util.Arrays;
import java.util.Scanner;
public class random_deck {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int scans=scanner.nextInt();
            int card=0;
            int distint=0;
            boolean[] found=new boolean[scans];
            while(distint<scans){
                int r=(int)(Math.random()*scans);
                card++;
                if (!found[r]){
                    distint++;
                    found[r]=true;
                }
            }
            System.out.println(Arrays.toString(found));
            System.out.println(card);
        }

    }
    
}
