package MultiThreading;

public class MultiThreadingExample {
    public static void main(String[] args) {
        MyThread obj = new MyThread();
        obj.start();
        System.out.println("Hellooooo");
    }
}

class MyThread extends Thread{
    public void run(){
        System.out.println("Hello");
        try{Thread.sleep(12000);
        }
        catch(Exception e){}
        System.out.println("Byeeee");
    }
}
