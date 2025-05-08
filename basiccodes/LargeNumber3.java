package BasicCodes;

import java.util.Scanner;

public class LargeNumber3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 distinct numbers");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if (x > y && x > z)
            System.out.println(x);
        else {
            if (z > y && z > x)
                System.out.println(z);
            else
                System.out.println(y);
        }

        sc.close();

    }
}