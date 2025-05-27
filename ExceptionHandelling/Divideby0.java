package ExceptionHandelling;

import java.util.Scanner;

public class Divideby0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two mumbers for division ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try{
            int c=a/b;

            System.out.println("Quotient = " + c);
        } catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Program runs successfully");
        sc.close();
    }
}
