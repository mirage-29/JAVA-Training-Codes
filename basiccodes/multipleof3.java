package basiccodes;
import java.util.Scanner;
public class multipleof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        if(n%3==0)
        System.out.println("Divisble by 3");
        else System.out.println("Not Divisble by 3");
       sc.close(); 
    }
}
