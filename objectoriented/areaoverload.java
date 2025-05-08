package ObjectOriented;
public class areaoverload {
    public static void main(String[] args) {
        area obj = new area();
        System.out.println("Area of Square is " + obj.calculatearea(15));
        System.out.println("Area of Rectangle is " + obj.calculatearea(15, 10));
        System.out.println("Area of Triangle is " + obj.calculatearea(15.0, 12.0));

    }
}

class area {
    int calculatearea(int l, int b) { // for rectangle
        return l * b;
    }

    int calculatearea(int s) { // for square
        return s * s;
    }

    double calculatearea(double b, double h) { // for triangle
        return 0.5 * b * h;
    }

}
