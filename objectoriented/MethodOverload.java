package ObjectOriented;

public class MethodOverload {
    public static void main(String[] args) {
        inheritence obj = new inheritence();
        System.out.println(obj.add(12, 10));
        System.out.println(obj.add(23, 25, 27));
        System.out.println(obj.add(12.5, 10.5));

    }
}

class MethodOverloadExample {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

class inheritence extends MethodOverloadExample {

}
