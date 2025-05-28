package CollectionFramework.Hashset;
import java.util.HashSet;
public class printfirstrepeated {
    public static void main(String[] args) {
        int a[]={1,2,2,3,4,5,6,6,6,7};
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            if(set.contains(a[i]))
            {
                System.out.println("\n\n\nFirst repeated element in Array : " + a[i] +"\n\n\n");
                break;
            }
            set.add(a[i]);

        }

    }
}
