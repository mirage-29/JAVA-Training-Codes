package variables;

public class staticvar {
    static int a = 40;
    static int b = 50;

    public static void main(String[] args) {
        System.out.println("Static variable a: " + a);
        System.out.println("Static variable b: " + b);
        System.out.println("Sum of a and b = " + sum(a, b));
    }

    static int sum(int a, int b) {
        return a + b;
    }
}
