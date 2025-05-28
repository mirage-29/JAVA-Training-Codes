package CollectionFramework.Hashset;
import java.util.HashSet;

public class Stringuniqueelements {
    public static void main(String[] args) {
        String str = "ajkaiubjksdbfuijbkwuiwiu3uiuidiw";
        HashSet<Character> unique = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            unique.add(str.charAt(i));

        }
        System.out.println(unique);
    }
}
