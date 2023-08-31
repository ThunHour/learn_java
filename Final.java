class bX{
    int speedlimit = 90;// final varia

    final void run() {
        System.out.println(speedlimit);
        speedlimit = 400;
        System.out.println(speedlimit);
    }
}
class tX extends bX {
    void start() {
        System.out.println(speedlimit);
    }
}

public class Final{
  
    public static void main(String[] args) {

        tX obj = new tX();
        obj.run();
        obj.start();
    }
}
