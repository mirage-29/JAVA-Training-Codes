package basiccodes;
import java.util.Scanner;
public class ASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("enter a character: ");
    char ch = sc.next().charAt(0);
    int x = ch;
    System.out.println("ASCII value of " + ch + " is " + x);
    sc.close();
    }
    
}
