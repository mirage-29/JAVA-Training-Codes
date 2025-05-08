package BasicCodes;

import java.util.Scanner;

public class primenumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int x;
        x = sc.nextInt();
        if(x==1)
            System.out.print("1 is neither prime nor composite");
        else System.out.println("is prime = " + isprime(x));
        sc.close();
    }
    public static boolean isprime(int x){
        boolean check = false;
        int i;
        for(i=2;i<x;i++){
            if(x%i==0){
                check = false;
            break;}

        }
        if(i==x)
            check = true;
return check;
    }
}
