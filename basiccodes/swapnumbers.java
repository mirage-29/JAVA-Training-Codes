
import java.util.Scanner;

public class swapnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter first number : ");
        int a = sc.nextInt();
        System.out.println(" Enter second number : ");
        int b = sc.nextInt();
        int t = 0;
        System.out.println(" Original Value of a = " + a);
        System.out.println(" Original Value of b = " + b);

        // Swappimg with temp variable
        t = a;
        a = b;
        b = t;
        System.out.println(" Value of a = " + a);
        System.out.println(" Value of b = " + b);

        // Swapping without temp variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(" Value of a = " + a);
        System.out.println(" Value of b = " + b);

        sc.close();

    }
}
