package pattern;
public class pattern1 {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++){
            for(int k=5;k>=i;k--){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            for(int p=0;p<=i;p++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=5;i>=0;i--){
            for(int k=5;k>=i;k--){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            for(int p=0;p<=i;p++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}
