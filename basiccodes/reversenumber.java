package basiccodes;
import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev=0;
        while(n>0)
        {
            rev = rev*10 + (n%10);
            n=n/10;

        }
        System.out.println("reverse of number is " + rev);
        sc.close();
    }
    
}
