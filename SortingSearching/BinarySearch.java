package SortingSearching;

import java.util.Scanner;

public class BinarySearch {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int arr[] = { 23, 12, 34, 35, 1, 5, 15, 34, 21 };
        int n = arr.length;
        arr = bubble(arr, n);
        System.out.println("Sorted Array is");
        for (int i : arr) {
            System.err.println(i);
        }
        System.out.println("Enter a value to search : ");
        int key = sc.nextInt();
        BinarySearch2(arr, n, key);

    }

    static int[] bubble(int arr[], int n) {
        int i;
        for (i = 0; i < n - 1; i++) {
            int count = 0;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count++;
                }
            }
            if (count == 0)
                break;

        }
        System.out.println(i);
        return arr;
    }

    static void BinarySearch2(int arr[], int n, int key) {
        int l = 0;
        int h = n - 1;
        int mid;
        while (l <= h) {
            mid = (l + h) / 2;
            if (arr[mid] == key) {
                System.out.println("Number is found at " + mid);
                break;
            } else {
                if (arr[mid] > key) {
                    h = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }
        if (l > h)
            System.err.println("Element not found");

    }

}
