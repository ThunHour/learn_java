abstract class Bike {
    abstract void run();
}

public class abstractClass extends Bike{
    void run() {
        System.out.println("running safely");
    }
       public static void main(String args[]){
       Bike obj = new abstractClass();
       obj.run();
}
}