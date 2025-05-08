package ObjectOriented;
public class Shapeabstract {
    public static void main(String[] args) {
        Shape obj = new Circle();
        obj.Area(23,1);

        Shape obj1 = new Rectangle();
        obj1.Area(12,10);

    }
}

abstract class Shape {
    abstract void Area(int a, int b);
}

class Rectangle extends Shape {

    void Area(int l, int b) {
        int area = l * b;
        System.out.println("Area of rectange is  " + area);

    }
}

class Circle extends Shape {

    void Area(int r,int k) {
        double area = 3.14 * r * r;
        System.out.println("Area of rectange is  " + area);

    }
}