public class for_loop {
    public static void main(String[] args) {
        int[] list={12,34,54,66,75,435,555};
        for(int i=0; i<list.length; i++) {
            System.out.println(String.format("%d is the %d INDEX of Arrays",list[i],i));
        }
    }
}
