
import java.util.Scanner;

public class secondmaxofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        int i, max, secondmax;
        for (i = 0; i < n; i++) {
            System.out.println("Enter the element: ");
            arr[i] = sc.nextInt();
        }
        max = arr[0];
        for (i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        secondmax = arr[0];
        for (i = 0; i < n; i++) {
            if (arr[i] > secondmax && arr[i] < max) {
                secondmax = arr[i];
            }
        }
        System.out.println("The maximum element in the array is: " + max);
        System.out.println("The second maximum element in the array is: " + secondmax);
        sc.close();

    }
}
