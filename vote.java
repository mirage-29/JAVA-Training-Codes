import java.util.Scanner;
public class vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age : ");
    int age = sc.nextInt();
    if(age>17)
    System.out.println("Can vote");
    else System.out.println("Cannot vote");
    
sc.close();    
    }
    
}
