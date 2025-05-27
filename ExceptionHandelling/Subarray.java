package ExceptionHandelling;

import java.util.Scanner;

public class Subarray {
    public static void main(String[] args) {
        int maxsum[] = new int[3];
        int maxindex;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array : ");

        int n = sc.nextInt();
        int arr[] = new int[n];
        System.err.println("Enter elements of array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        try {
            maxindex = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > arr[maxindex]) {
                    maxindex = i;
                }

            }
            maxsum[0] = maxindex;

            if (maxsum[0] != 0)
                maxindex = 0;
            else
                maxindex = 1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > arr[maxindex] && arr[i] <= arr[maxsum[0]] && i != maxsum[0]) {
                    maxindex = i;
                }

            }
            maxsum[1] = maxindex;

            if (maxsum[0] != 0 && maxsum[1] != 0)
                maxindex = 0;
            else if (maxsum[0] != 1 && maxsum[1] != 1)
                maxindex = 1;
            else
                maxindex = 2;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > arr[maxindex] && arr[i] <= arr[maxsum[1]] && i != maxsum[1]) {
                    maxindex = i;
                }

            }
            maxsum[2] = maxindex;

            System.out.println("Largest Sub array :");
            System.err.println(arr[maxsum[0]]);
            System.err.println(arr[maxsum[1]]);
            System.err.println(arr[maxsum[2]]);

        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Code Run Successfully");
        sc.close();
    }
}
