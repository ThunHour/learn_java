public class class_ex {
    
        int area(int a) {
            return a ^ 2;
        };

        int area(int i, int b) {
            return (i * b)/2 ;
        }

        double area(double r) {
            return 3.14 * r * r;
        }
    public static void main(String[] args) {
        class_ex shape = new class_ex();
        System.out.println("result = "+shape.area(10));
        System.out.println("result = "+shape.area(10,12));
        System.out.println("result = "+shape.area(10.9));

    }
}