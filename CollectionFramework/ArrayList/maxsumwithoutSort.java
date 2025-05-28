package CollectionFramework.ArrayList;

import java.util.ArrayList;

public class maxsumwithoutSort {
    public static void main(String[] args) {
        int maxsum = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(-4);
        arr.add(6);
        arr.add(0);
        arr.add(-7);
        arr.add(3);
        arr.add(4);
        arr.add(-8);
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {

            if (arr.get(i) >= 0)
                max += arr.get(i);
            else if (maxsum < max) {
                maxsum = max;
                max = 0;
            }

        }

        System.out.println("Max Continous Sum : " + maxsum);

    }
}
