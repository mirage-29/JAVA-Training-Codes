import java.util.Scanner;
public class vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char alphabet = sc.next().charAt(0);
        if ( alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u' )
        System.out.println("Vowel");
        else System.out.println("consonant");

        sc.close();
        
    }
    
}
