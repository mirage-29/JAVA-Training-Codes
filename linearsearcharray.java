import java.util.Scanner;

public class linearsearcharray {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        int i,search;
        for (i = 0; i < n; i++) {
            System.out.println("Enter the element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("enter element to search : ");
        search=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(arr[i]==search)
            {
                System.err.println("Element is found at "+ i + " index");
                break;
            }
            
        }
        if(i==n)
        System.err.println("Element not found");
    }
    
}
