package JavaFeatures.Lambda;

import java.util.ArrayList;

import java.util.Collections;

public class lambdawithArraylist {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("Rajnesh");
    list.add("Ganesh");
    list.add("Aakash");
    System.out.println(list);
    // Collections.sort(list,new Comparator<String>() {

    // @Override
    // public int compare(String a, String b) {
    // return a.compareTo(b);
    // }
    // });
    // System.out.println(list);

    Collections.sort(list, (a, b) -> a.compareTo(b));
    System.out.println(list);
  }
}