public class threadExtend extends Thread {
    public void run() {
        System.out.println("This code is running in a thread");
    }
    public static void main(String[] args) {
        threadExtend thread = new threadExtend();
        thread.start();
        System.out.println("This code is outside of the thread");
    }


}