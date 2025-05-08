package MiscCodes;
import java.util.Scanner;

public class PP1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
       int n = sc.nextInt();
        int x = n;
        int count = Countdigits(x);
        int num = 0;
        num = num * 10 + (n % 10);
        n /= 10;
        count--;
        int refer = 1;
        for (int i = 1; i < count; i++) {
            refer *= 10;
        }
        int first = (n / refer);
        n = n-(first * refer);
        num *= refer;
        num += n;
        num *= 10;
        num += first;
        System.out.println(num);

    }

    static int Countdigits(int n) {

       
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;

        }
        return count;
    }
}
