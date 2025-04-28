//package variables;

public class differentclass {

    int a = 40;
    int b = 50;
    public static void main(String[] args) {
        differentclass obj = new differentclass();
        System.out.println("Non-static variable a: " + obj.a);
        System.out.println("Non-static variable b: " + obj.b);
        System.out.println("Sum of a and b = " + obj.sum(obj.a, obj.b));

        trysum obj2 = new trysum();
        obj2.test();
        }
        int sum(int a, int b) {
            return a + b;
           
    }
  
}
 class trysum
 {
    public void test() {
       differentclass obj = new differentclass();
        System.out.println("Non-static variable a: " + obj.a);
        System.out.println("Non-static variable b: " + obj.b);
    }
  

    
}

