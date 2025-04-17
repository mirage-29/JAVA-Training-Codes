import java.util.Scanner;

public class sumdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find the sum of its digits: ");
        int n = sc.nextInt(); // Read an integer from the user  
        int sum = 0;
        while (n > 0) {
            sum += n % 10; // Add the last digit to sum
            n /= 10; // Remove the last digit from n
        }
        System.out.println("Sum of digits: " + sum);
        sc.close(); // Close the scanner to prevent resource leaks
    }
}
