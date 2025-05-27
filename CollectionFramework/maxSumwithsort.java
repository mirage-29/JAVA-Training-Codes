package CollectionFramework;

import java.util.Collections;
import java.util.ArrayList;

public class maxSumwithsort {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(-4);
        arr.add(6);
        arr.add(0);
        arr.add(-7);
        arr.add(3);
        arr.add(4);
        arr.add(-8);
        Collections.sort(arr);
        int maxsum=0;
        for (int index = 0; index < arr.size(); index++) {
            if(arr.get(index)>0)
            {
                maxsum+=arr.get(index);
            }
            
        }
        System.out.println(maxsum);
        
        
    }
}
