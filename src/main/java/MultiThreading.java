import java.sql.SQLOutput;

class MultiThreading extends Thread {
    public void run() {
        for(int i=1;i<4; i++) {
            System.out.println(Thread.currentThread().getName() + "in control");
        }
    }

    public static void main(String[] args) {
        MultiThreading t1= new MultiThreading();
        MultiThreading t2= new MultiThreading();
        t1.setName("first thread");
        t2.setName("second thread");
        t1.start();
        t2.start();
        for(int i=1; i<4; i++) {
            t1.yield();
            System.out.println(Thread.currentThread().getName()+ "in controlll");
        }
    }
}