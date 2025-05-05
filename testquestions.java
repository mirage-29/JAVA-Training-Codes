import java.util.Scanner;

public class testquestions {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Press 0 to exit");
            System.out.println("Press 1 to print all natural numbers upto n");
            System.out.println("Press 2 to print all even numbers between two numbers");
            System.out.println("Press 3 to print n natural numbers in reverse order");
            System.out.println("Press 4 to find sum of n natural numbers");
            System.out.println("Press 5 to find product of n natural numbers");
            System.out.println("Press 6 to extract and display all digits from a given number");
            System.out.println("Press 7 to sum of digits of a given number");
            System.out.println("Press 8 to find the count of digits in a given number");
            System.out.println("Press 9 to print reverse of a number");
            System.out.println("Press 10 to check if a number is palindrome or not");
            System.out.println("Press 11 to find all factors of a given number");
            System.out.println("Press 12 to find sum of all factors of a given number");
            System.out.println("Press 13 to find count of all factors of a given number");
            System.out.println("Press 14 to check whether a number is prime or not");
            System.out.println("Press 15 to print all prime numbers between 1 to 100");
          
            System.out.print("Enter your choice : ");
            int k = sc.nextInt();
            if (k == 0)
                break;
            switch (k) {
                case 1:
                    Printn();
                    break;
                case 2:
                    Printeven();
                    break;
                case 3:
                    Printnrev();
                    break;
                case 4:
                    Printnsum();
                    break;
                case 5:
                    Printnproduct();
                    break;
                case 6:
                    Printdigits();
                    break;
                case 7:
                    Sumdigits();
                    break;
                case 8:
                    Countdigits();
                    break;
                case 9:
                    reversenum();
                    break;
                case 10:
                    palindromenum();
                    break;
                case 11:
                    factors();
                    break;
                case 12:
                    sumoffactors();
                    break;
                case 13:
                    countoffactors();
                    break;
                case 14:
                    primenum();
                    break;
                case 15:
                    primenum1to100();
                    break;

                default:
                    System.err.println("Invalid input");
            }
        }
    }

    static void Printn() {
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        System.err.println("Press any key to continue");
        try{
            System.in.read();
           } catch(Exception e){}
    }

    static void Printeven() {
        System.out.print("Enter value of Lower limit: ");
        int l = sc.nextInt();
        System.out.print("Enter value of Higher limit: ");
        int h = sc.nextInt();
        if (l % 2 != 0)
            l++;

        for (int i = l; i <= h;) {
            System.out.println(i);
            i += 2;
        }
        System.err.println("Press any key to continue");
        try{
            System.in.read();
           } catch(Exception e){}
    }

    static void Printnrev() {
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        for (int i = n; i >= 0; i--) {
            System.err.println(i);
        }
        System.err.println("Press any key to continue");
        try{
            System.in.read();
           } catch(Exception e){}
    }

    static void Printnsum() {
        int sum = 0;
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        for (int i = n; i > 0; i--) {
            sum += i;

        }
        System.out.println("Sum of all natursl numbers from 1 to " + n + " = " + sum);
        System.err.println("Press any key to continue");
        try{
            System.in.read();
           } catch(Exception e){}
    }

    static void Printnproduct() {
        int product = 1;
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        for (int i = n; i > 0; i--) {
            product *= i;

        }
        System.out.println("Product of all natursl numbers from 1 to " + n + " = " + product);
        System.err.println("Press any key to continue");
        try{
            System.in.read();
           } catch(Exception e){}
    }

    static void Printdigits() {
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        while (n > 0) {
            System.err.println(n % 10);
            n /= 10;

        }
        System.err.println("Press any key to continue");
        try{
            System.in.read();
           } catch(Exception e){}
    }

    static void Sumdigits() {
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        int x = n;
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;

        }
        System.err.println("Sum of digits of " + x + " = " + sum);
        System.err.println("Press any key to continue");
        try{
            System.in.read();
           } catch(Exception e){}
    }

    static void Countdigits() {
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        int x = n;
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;

        }
        System.err.println("Total number of digits in " + x + " = " + count);

        System.err.println("Press any key to continue");
        try{
            System.in.read();
           } catch(Exception e){}
    }

    static void reversenum() {
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        int x = n;
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;

        }
        System.err.println("Sum of digits in " + x + " = " + rev);
        System.err.println("Press any key to continue");
        try{
            System.in.read();
           } catch(Exception e){}
    }

    static void palindromenum() {
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        int x = n;
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;

        }
        if (x == rev)
            System.err.println("Palindrome");
        else
            System.err.println("Not Palindrome");
            System.err.println("Press any key to continue");
            try{
                System.in.read();
               } catch(Exception e){}
    }

    static void factors() {
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.err.println(i);
        }
        System.err.println("Press any key to continue");
        try{
            System.in.read();
           } catch(Exception e){}
    }

    static void sumoffactors() {
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                sum += i;
        }
        System.out.println("Sum of all factors of " + n + " = " + sum);
        System.err.println("Press any key to continue");
        try{
            System.in.read();
           } catch(Exception e){}
    }

    static void countoffactors() {
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        System.out.println("Count of all factors of " + n + " = " + count);
        System.err.println("Press any key to continue");
        try{
            System.in.read();
           } catch(Exception e){}
    
    }

    static void primenum() {
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int i;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("Number is not prime");
                break;
            }

        }
        if (i == n)
            System.out.println("Number is prime");
            System.err.println("Press any key to continue");
            try{
                System.in.read();
               } catch(Exception e){}
    }

    static void primenum1to100() {

        int i, j;
        for (j = 2; j <= 100; j++) {
            for (i = 2; i < j; i++) {
                if (j % i == 0)
                    break;
            }
            if (i == j)
                System.out.println(j);
        }
        System.err.println("Press any key to continue");
        try{
            System.in.read();
           } catch(Exception e){}
    }

    static void primenumltoh() {
        System.out.println("Enter lower limit ");
        int l = sc.nextInt();
        System.out.println("Enter higher limit ");
        int h = sc.nextInt();
        int i, j;
        for (j = l; j <= h; j++) {
            for (i = 2; i < j; i++) {
                if (j % i == 0)
                    break;
            }
            if (i == j)
                System.out.println(j);
        }

        System.err.println("Press any key to continue");
        try{
            System.in.read();
           } catch(Exception e){}
    }

}
