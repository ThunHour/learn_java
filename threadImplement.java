public class threadImplement implements Runnable{
    public static void main(String[] args) {
        threadImplement object = new threadImplement();
        Thread t = new Thread(object);
        t.start();
        System.out.println("This code is outside of the thread");

    }
    public void run() {
        System.out.println("This code is running in the thread");
    }
}
