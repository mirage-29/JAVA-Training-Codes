package CollectionFramework.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentbyNameAge {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Raunak", 21, 21));
        list.add(new Student("Rajeev", 16, 20));
        list.add(new Student("Rohini", 23, 32));
        list.add(new Student("Mukesh", 45, 10));
        list.add(new Student("Aastha", 11, 33));

        // Sort by age
        Collections.sort(list, new sortByAge());

        for (Student s : list) {
            System.out.println(s);
        }
        System.out.println("\n\n");

        // Sort by Name

        Collections.sort(list, new sortByName());

        for (Student s : list) {
            System.out.println(s);
        }
         System.out.println("\n\n");

         // Sort by roll

        Collections.sort(list, new sortByRoll());

        for (Student s : list) {
            System.out.println(s);
        }
    }

}

class Student {
    int age;
    String name;
    int RollNo;

    public Student(String name, int age, int roll) {
        this.name = name;
        this.age = age;
        this.RollNo = roll;
    }

    // makes return value instead of reference
    public String toString() {
        return age + "   " + name + "    " + RollNo;
    }
}

// Compares by age
class sortByAge implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.age - s2.age;

    }
}

// Compares by Roll
class sortByRoll implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.RollNo - s2.RollNo;

    }
}

// Compares by name
class sortByName implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);

    }
}
