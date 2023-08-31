public class Deckofcard {
    public static void main(String[] args) {
        String[] rank={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String[] suit={"hearts","diamond","spades","clubs"};
        String[] deck=new String[52];
        for (int i=0;i<rank.length;i++) {
            for (int j=0;j<suit.length;j++){
                deck[i+13*j] = rank[i]+suit[j];
            }
        }
        for (int x=0;x<deck.length;x++){
            System.out.println(deck[x]);
        }
       
    }
}
