package BasicCodes;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();
        System.out.println("Enter operator : ");
        char c = sc.next().charAt(0);
        if (c == '+')
            System.out.println(a + b);
        else {
            if (c == '-')
                System.out.println(a - b);
            else {
                if (c == '*')
                    System.out.println(a * b);
                else {
                    if (c == '/') {
                        if (b != 0)
                            System.out.println(a / b);
                        else
                            System.err.println("Division by 0 error");
                    } else {
                        if (c == '%') {
                            if (b != 0)
                                System.out.println(a % b);
                            else
                                System.err.println("Division by 0 error");

                        } else
                            System.err.println("Invalid Operator");
                    }

                }
            }
        }
        sc.close();  
    }
}