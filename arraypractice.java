import java.util.Scanner;

public class arraypractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int i = 0, sum = 0;
        System.out.println("Enter 5 numbers: ");
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }
        System.out.println("\nSum of the array elements: " + sum);
       sc.close();

    }

}
