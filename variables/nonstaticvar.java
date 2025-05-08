package Variables;


public class nonstaticvar {
    int a = 40;
    int b = 50;
    public static void main(String[] args) {
        nonstaticvar obj = new nonstaticvar();
        System.out.println("Non-static variable a: " + obj.a);
        System.out.println("Non-static variable b: " + obj.b);
        System.out.println("Sum of a and b = " + obj.sum(obj.a, obj.b));
    }

    int sum(int a, int b) {
        return a + b;
    }
}

