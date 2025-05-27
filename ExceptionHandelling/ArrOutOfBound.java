package ExceptionHandelling;

import java.util.Scanner;

public class ArrOutOfBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.print("enter the size of array : ");

        int n = sc.nextInt();
        int arr[]= new int[n];
        System.err.println("Enter elements of array :");
         for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
        try{
           System.out.print("Enter idex of array : ");
           int x = sc.nextInt();
           System.out.println(arr[x]);
        }catch(Exception e)
        {
            System.out.println(e);
        }

        System.out.println("Code Run Successfully");
        sc.close();
    }
}
