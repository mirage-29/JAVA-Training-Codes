package MultiThreading;

public class WaitNotify {
    private boolean isSignalled = false;

    public synchronized void sendSignal() {
        isSignalled = true;
        System.out.println("Producer : Sending signal ......");
        notify();

    }

    public synchronized void WaitForSignal() {
        while (!isSignalled) {
            System.out.println("Consumer : Waiting for Signal .....");
            try {
                wait();
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
        System.out.println("Consumer : Received Signal.....\n\t   Proceeding...... ");
    }

    public static void main(String[] args) {
        WaitNotify obj = new WaitNotify();
        Thread Producer = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
              
                e.printStackTrace();
            }
            obj.sendSignal();
        });
        Thread Consumer = new Thread(() -> {

            obj.WaitForSignal();
        });
        Producer.start();
        Consumer.start();
    }
}
