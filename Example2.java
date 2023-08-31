public class Example2 {
    public static void main(String[] args) {
        try {
            int a[] = new int[7];
            a[3] = 30 / 0;
            System.out.println(a[3]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds exception");
        }catch (Exception e) {
            System.out.println("Exception");
        }
        System.out.println("Program is finished");
    }
}
