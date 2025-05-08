package MiscCodes;
import java.util.Scanner;
public class pp1string {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = Integer.toString(n);
        int size = str.length();
        str=str.substring(size-1, size)+str.substring(1, size-1)+str.substring(0, 1);
        
        n = Integer.parseInt(str);
        System.out.println(n);
        sc.close();
        

  
        }
    }

