package strings;
import java.util.Scanner;

public class stringprint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String str2 = "";
        System.out.println(str);

        for (int i = str.length() - 1; i >= 0; i--) {
            str2 += str.charAt(i);

        }
        System.out.println(str2);
        if (str.equals(str2)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
        sc.close();
    }
}
