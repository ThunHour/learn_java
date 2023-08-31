abstract class Area {

    double dim1;
    
    double dim2;
    
    Area(double a, double b) {
    
    dim1 = a;
    
    dim2 = b;
    
    }
    
    abstract double calc_area();
    }
    
class Rectangle extends Area {
    
    Rectangle(double a, double b) {
    
    super(a, b);
    
    }
    double calc_area() {
    System.out.println("The Area for Rectangle.");
    return dim1 * dim2;
    }
    
    }
    
class Triangle extends Area {
    
    Triangle(double a, double b) {
    
    super(a, b);
    
    }
    double calc_area() {
    
    System.out.println("The Area for Triangle.");
    
    return dim1 * dim2 / 2;
    
    }
    
    }
    
    class AbstractAreas {
    
    public static void main(String args[]) {
    
    Rectangle rectangle = new Rectangle(8, 5);
    
    Triangle triangle = new Triangle(2, 8);
    
    Area compute; 
    
    compute = rectangle;
    
    System.out.println("Area is " + compute.calc_area());
    
    compute = triangle;
    
    System.out.println("Area is "+ compute.calc_area());
    
    }
    
    }