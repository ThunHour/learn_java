public class swap {
    public static void main(String[] args) {
        int[] arr = { 12, 13, 14, 15 };
        swap.swap(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }

    static int[] swap(int array[]) {
        int temp1 = array[0];
        int temp2 = array[1];
        array[0] = temp2;
        array[1] = temp1;
        return array;
    }
}