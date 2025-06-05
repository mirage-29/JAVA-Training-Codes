package MultiThreading;

public class PriorityInThreads {
    public static void main(String[] args) {
       
        MyThread1 t1 = new MyThread1();
        MyThread1 t2 = new MyThread1();
        t1.setName("High Priority Thread");
         t2.setName("Low Priority Thread");
         t1.setPriority(Thread.MAX_PRIORITY);
         t2.setPriority(Thread.MIN_PRIORITY);
         t1.start();
         t2.start();
    }
}
class MyThread1 extends Thread {
public void run(){
    for (int i = 1; i <= 10; i++) {
        System.out.println(getName() + " is running with high priority");
        Thread.yield();
    }
}

    
}
