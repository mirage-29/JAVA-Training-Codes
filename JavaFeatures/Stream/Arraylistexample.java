package JavaFeatures.Stream;
import java.util.stream.*;

import java.util.ArrayList;

public class Arraylistexample {
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



        ArrayList<Integer> data1 = (ArrayList<Integer> )list.stream().map(a -> a*5).collect(Collectors.toList());
        ArrayList<Integer> data = (ArrayList<Integer> )list.stream().filter(a->a>2).collect(Collectors.toList());
        System.out.println(data);
        System.out.println(data1);
    }
}
