package basiccodes;
import java.util.Scanner;
public class palindromnum {
    public static void main(String[] args) {
        int n, r, rev = 0, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a palindrome: ");
        n = sc.nextInt(); // Read an integer from the user
        temp = n; // Store the original number
        while (n > 0) {
            r = n  % 10; // Get the last digit
            rev = (rev * 10) + r; // Reverse the number
            n = n / 10; // Remove the last digit
        }
        if (temp == rev) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
        sc.close(); 
    }
}
