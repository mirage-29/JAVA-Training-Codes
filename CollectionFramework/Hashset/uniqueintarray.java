package CollectionFramework.Hashset;

import java.util.HashSet;

public class uniqueintarray {
      public static void main(String[] args) {
        int arr[] ={1,1,1,2,2,2,2,3,3,3,3,8,8,8,7};
        HashSet<Integer> unique = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            unique.add(arr[i]);

        }
        System.out.println(unique);
    }
}
