import java.util.Scanner;
public class UcaseLcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);
        if (input >= 'A' && input <= 'Z')
        System.out.println("Uppercase");
     else if (input >= 'a' && input <= 'z')
        System.out.println("Lowercase");
     else
        System.out.println("Not an alphabet");

        sc.close();
        
    }
    
}
