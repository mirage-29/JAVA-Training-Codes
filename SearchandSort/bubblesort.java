

public class bubblesort {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = arr.length;
        arr = bubble(arr, n);
       
        for (int i : arr) {
            System.out.println(i);
            
        }
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

}
