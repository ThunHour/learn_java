import java.util.Scanner;
public class coupon {
 public static void main(String[] args) {
    String[] rank={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    String[] suit={"hearts","diamond","spades","clubs"};
    String[] deck=new String[52];
    for (int i=0;i<rank.length;i++) {
        for (int j=0;j<suit.length;j++){
            deck[i+13*j] = rank[i]+suit[j];
        }
    }
    // shuffle
    for(int i=0;i<deck.length;i++){
        int r=(int)(Math.random()*(52-i));
        String temp = deck[r];
        deck[r] = deck[i];
        deck[i] = temp;
    }
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter number of card that you want to get:");
    int scan=scanner.nextInt();
    for(int i=0;i<scan;i++) {
        System.out.print(deck[i]+" ");
    }
 }   
}
