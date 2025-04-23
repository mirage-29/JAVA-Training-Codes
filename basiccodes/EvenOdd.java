package basiccodes;
import java.util.Scanner;

        public class EvenOdd {
            public static void main(String args[] ) throws Exception {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a number : ");
                int x = sc.nextInt();
                if(x==0)
                {
                    System.out.println("Zero");
                    
                }
                else{
                    if(x%2==0)
                    {
                        System.out.println("Even");
                    }
                    else
                        System.out.println("Odd");
                sc.close();        
                }
                
            }
        }