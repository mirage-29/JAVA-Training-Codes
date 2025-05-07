public class thiskeyword {
    public static void main(String[] args) {
        Student obj = new Student("Raunak", 20);
        obj.print();

    }
}

class Student {
    int age;
    String name;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void print() 
     {
        System.out.println(name);

        System.out.println(age);
    }
}
