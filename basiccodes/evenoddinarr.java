package basiccodes;
import java.util.Scanner;

public class evenoddinarr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        int i, even = 0, odd = 0;
        for (i = 0; i < n; i++) {
            System.out.println("Enter the element: ");
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("count of even numbers = " + even);
        System.out.println("count of even numbers = " + odd);
        sc.close();
    }

}
