package basiccodes;
import java.util.Scanner;

public class Divisblity {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if ((x % 5 == 0) && (x % 11 == 0))
            System.out.println("Disvisible");
        else
            System.out.println("Not Disvisible");
        sc.close();

    }
}