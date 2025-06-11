package JavaFeatures.Lambda;

public class Lambda {
    public static void main(String[] args) {
        Runnable r = () -> {System.out.println("This is lambda defintion ");
    System.out.println("We can write as many statements as we want ");};
        r.run();
    }
}
