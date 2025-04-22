public class sumoftwoarray {
    public static void main(String[] args) {
        int[] a1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] a2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] a3 = new int[9];
        int sum1 = 0;
        int i;
        for (i = 0; i < 9; i++) {
            sum1 += a1[i] + a2[i];
            a3[i] = a1[i] + a2[i];
        }
        System.out.println("Sum of elements of two array : " + sum1);
        for (i = 0; i < 9; i++) {
            System.out.print(a3[i] + "\t");
        }
    
    }
}
