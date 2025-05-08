package SortingSearching;

public class PackagePractice {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int x =5;
      
        linearseach obj = new linearseach();
        int result = obj.linearSearch(arr, x);
        if (result == -1) {
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Element found at index " + result);
        }
      
    }
}
