class ThreadDemo1_1 extends Thread{
    ThreadDemo1_1(String a,ThreadGroup b){
        super(b,a);
    }; 
    public void run() {
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(10);
            }catch(InterruptedException ex){
                System.out.println(Thread.currentThread().getName());
            }
        }
        System.out.println(Thread.currentThread().getName());
    }
}
public class thread {
    public static void main(String[] args)throws InterruptedException {
        ThreadGroup obj1=new ThreadGroup("Parent thread ===>");
        ThreadGroup obj2=new ThreadGroup(obj1,"child thread ===>");
        ThreadDemo1_1 t1=new ThreadDemo1_1("******THread-1********",obj1);
        t1.start();
        ThreadDemo1_1 t2=new ThreadDemo1_1("******THread-2********",obj2);
        t2.start();
    }
}
