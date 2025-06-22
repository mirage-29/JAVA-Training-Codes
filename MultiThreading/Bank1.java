package MultiThreading;

public class Bank1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Withdraw(800));
        Thread t2 = new Thread(new Withdraw(500));
        t1.start();
        t2.start();
    }
}

class Withdraw extends Thread {
    static int totalamount = 1000;
    int amount; 

    Withdraw(int amount) {

        this.amount = amount;
    }

    public void run() {
        synchronized(Withdraw.class) {
            if (amount > totalamount) {
                System.out.println("Hatt Gareeb , Baap ne bhi Dekha Hai Kbhi Itna Paisa !!! ");
            } else {
                System.out.println("Paisa chla gya " + amount);
                totalamount -= amount;
                System.out.println("Remaining balance = " + totalamount);
            }
        }
    }
}
