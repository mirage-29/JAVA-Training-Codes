package CollectionFramework.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class lettercount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Character, Integer> map = new HashMap<>();
        System.out.println("Enter a String ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else
                map.put(ch, 1);
        }
        map.forEach((key, value) -> {
            System.out.println(key + " = " + value);
        });
        sc.close();
    }
}
