package CollectionFramework.HashMap;

import java.util.HashMap;
 
public class map {
    public static void main(String[] args) {
        HashMap<Character,String> map = new HashMap<>();
        System.out.println("\n\n\n");
        map.put('A',"The first alphabet");
        map.put('B'," The second alphabet");
        map.put('C'," The third alphabet");
        map.put('D'," The fourth alphabet");
        map.put('E'," The fifth alphabet");
        System.out.println(map);
        System.out.println(map.get('E'));
        System.out.println(map.getOrDefault('F',"Does not Exist"));
        System.out.println(map.keySet());
         System.out.println(map.values());
         map.forEach((key,value) -> {
System.out.println(key + " = " + value);
         });
    }
}
