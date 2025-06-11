package JavaFeatures.Stream;

import java.util.ArrayList;
import java.util.stream.*;

public class MaxMin {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(0);
        list.add(-1);
        list.add(7);
        list.add(9);
        list.add(-6);
        int max = list.stream().reduce(0, (a, b) -> a > b ? a : b);
        int min = list.stream().reduce(0, (a, b) -> a < b ? a : b);
        System.out.println(max);
        System.out.println(min);
    }
}