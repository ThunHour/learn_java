class pen {
}

class paper {
}

public class deadlockSynchronize {

    public static void main(String[] args) {

        final pen pn = new pen();

        final paper pr = new paper();

        Thread t1 = new Thread() {

            public void run() {

                synchronized (pn) {

                    System.out.println("Thread1 is holding Pen");

                    try {

                        Thread.sleep(1000);

                    } catch (InterruptedException e) {

                        System.out.println("Thread 1 error");
                    }
                }
                synchronized (pr) {
                    System.out.println("Requesting for Paper");

                }
            }
        };

        Thread t2 = new Thread() {

            public void run() {

                synchronized (pr) {

                    System.out.println("Thread2 is holding Paper");

                    try {

                        Thread.sleep(1000);

                    } catch (InterruptedException e) {

                        System.out.println("Thread requesting failure");

                    }
                }
                synchronized (pn) {

                    System.out.println("requesting for pen");

                }
            }
        };

        t1.start();
        
        t2.start();

    }
}
