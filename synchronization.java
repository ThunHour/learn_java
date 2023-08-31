class Table{
    synchronized void printTable(int n){
        for(int i=0; i<=5; i++){
            System.out.println("Table"+n*i);
            try {
                Thread.sleep(400);

            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
class MyThread1 extends Thread{
    Table t; 
    MyThread1(Table t){
        this.t = t;
    }
    public void run(){
        t.printTable(5);
    }
}

class MyThread2 extends Thread{
    Table t;
    MyThread2(Table t){
        this.t = t;
    }public void run(){
        t.printTable(100);
    }
}
public class synchronization{
    public static void main(String[] args) {
        Table obj = new Table();
        MyThread1 myThread1 = new MyThread1(obj);
        MyThread2 myThread2 = new MyThread2(obj);
        myThread1.start();
        myThread2.start();
    }
}