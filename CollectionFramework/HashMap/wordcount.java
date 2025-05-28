package CollectionFramework.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class wordcount {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> map = new HashMap<>();
        System.out.println("Enter a String ");
        String str = sc.nextLine();
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            
            if(str.charAt(i)!=' ')
            {
                str1+=str.charAt(i);
            }
            else{
                if(map.containsKey(str1))
                {
                    map.put(str1,map.get(str1)+1);
                }
                else
                map.put(str1, 1);
                str1="";
            }
       
    }
   map.forEach((key, value) -> {
            System.out.println(key + " = " + value);
        });
}

}