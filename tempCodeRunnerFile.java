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
    }