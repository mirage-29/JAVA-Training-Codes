package MultiThreading;

public class mainClass {
    public static void main(String[] args) {
        MyThread obj = new MyThread();
        Thread T1 = new Thread(obj);
        T1.start();
        try {
            T1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hellooooo");
    }
}

class MyThread implements Runnable {
    public void run() {
        System.out.println("Hello");

    }

}
