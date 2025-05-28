package CollectionFramework.ArrayList;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
     
            
        
        ArrayList<String> list = new ArrayList<>();
        list.add("Raunak");
        list.add("Rajnesh");
        list.add("Vidhant");
        list.add("Astha");
        list.add("Jiya");
        System.out.println("Intial ArrayList : ");
        System.out.println(list);
        System.out.println("Adding Priyanshu after Rajnesh : ");
        list.add(2, "Priyanshu");
        System.out.println(list);
        System.out.println("Replace Astha with Ashu : ");
        list.set(4, "Ashu");
        System.out.println(list);
        if (list.contains("Jiya"))
            System.out.println("Jiya is in the list at " + list.indexOf("Jiya") + " index");
        else
            System.out.println("Jiya is not in the list");
        System.out.println("Deleting Jiya : ");
        list.remove("Jiya");
        System.out.println(list);
       

        System.out.println("Clearing all Array : ");
        list.clear();
        System.out.println(list);
    }
}
