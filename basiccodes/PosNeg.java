package basiccodes;
 import java.util.Scanner;

  public class PosNeg {
            public static void main(String args[] ) throws Exception {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a number : ");
                int n = sc.nextInt();
                if(n==0){
                    System.out.println("Zero");
                }
                else 
                {
                    if(n>0)
                        System.out.println("Positive");
                    else
                        System.out.println("Negative");
                }
                sc.close();
            }
        }