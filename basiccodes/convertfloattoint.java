package basiccodes;
import java.util.Scanner;;
public class convertfloattoint {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a float value : ");
        float f = sc.nextFloat(); // Example float value
        System.out.println("original float value: " + f);
        int i = (int) f; // Explicitly convert float to int
        System.out.println("Converted int value: " + i); // Output: 10
        sc.close();
    }
}
