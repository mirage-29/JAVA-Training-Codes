package ExceptionHandelling;

public class Stringex {
    public static void main(String[] args) {
        String Str = null;
    try{
        System.err.println(Str.toUpperCase());
    }catch(Exception e ){
        System.out.println(e);
    }
    System.out.println("Code Run Successful");


    }
}
