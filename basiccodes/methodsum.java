package basiccodes;
import java.util.Scanner;

public class methodsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers to find sum : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        methodsum o1 = new methodsum();
        int sum = o1.sum(a, b);
        System.out.println("Sum = " + sum);
        sc.close();
    }

    int sum(int a, int b) {
        return (a + b);
    }

}
