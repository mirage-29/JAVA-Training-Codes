package CollectionFramework.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentByName {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Raunak", 21));
        list.add(new Student("Rajnesh", 16));
        list.add(new Student("Rohit", 23));
        list.add(new Student("Mukesh", 45));
        list.add(new Student("Vidhant", 11));

        Collections.sort(list);

        for(Student s:list)
        {
            System.out.println(s);
            //it calls toString function automatically
        }
    }
    
}

class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    public int compareTo(Student s){
         
        return this.name.compareTo(s.name);
    
    }

    public String toString(){
        return age + "   " + name;
    }
}
