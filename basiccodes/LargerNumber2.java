package basiccodes;
import java.util.Scanner;

public class LargerNumber2 {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x > y)
            System.out.println(x + "is greater");
        else if (y > x)
            System.out.println(y + " is greater");
        else
            System.out.println(" Both are equal");
        sc.close();
    }
}
