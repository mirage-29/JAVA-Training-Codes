package MultiThreading;

public class OtherwayofCreatingThreads{
    public static void main(String[] args) {
        System.out.println("Hiiiiii");

        Thread t1 = new Thread( ()->{
            System.out.println("Hum first hum First ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
            System.out.println("Mai Baad mein Aaunga");
        });
          Thread t2 = new Thread( ()->{
            System.out.println("Helllo");
        });
          Thread t3 = new Thread( ()->{
            System.out.println("byeeee");
        });

         Thread t4 = new Thread( ()->{
        t1.start();
        t2.start();
        t3.start();
        });
        t4.start();
        
       
    }
}