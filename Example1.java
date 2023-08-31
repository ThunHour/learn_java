public class Example1 {
    public static void main(String args[]) {
        try {
            System.out.println("First statement of try block");
            int num = 45 / 3;
            System.out.println(num);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Idex Out Of Bounds Exception");
        } finally {
            System.out.println("finally block");
        }

    }
}
