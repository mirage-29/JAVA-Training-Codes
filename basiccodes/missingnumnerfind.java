public class missingnumnerfind {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 10, 8, 9};
        int n = arr.length +1;
        int total = (n * (n + 1)) / 2;
        for (int i = 0; i < arr.length; i++) {
            total -= arr[i];
        }
        System.out.println("The missing number is: " + total);
    }
    
}
