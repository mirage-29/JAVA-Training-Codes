package CollectionFramework.LinkedList;

import java.util.LinkedList;

public class linkedlist2 {
    public static void main(String[] args) {
         
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i=0;i<1001;i++)
        {
            list.add(i);
        }
        int n = list.indexOf(100);
        int x = list.indexOf(200);
        for(;n<=x;n++)
        {
            System.out.print(list.get(n) + " | ");
        }
    }
}
