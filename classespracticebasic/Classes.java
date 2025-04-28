public class Classes {
	public static void main(String[] args) {
		Student sc = new Student();
		System.out.println(sc);
		
		Car c = new Car();
		c.color = "red";
		System.out.println(c.color);

		Book b = new Book();
		b.Title = "Java Fundamentals";
		b.Author = "Raunak Mishra";
		System.out.println(b.Title);
		System.out.println(b.Author);


	}
	public static class Student {
	
}
public static class Car {
	String color ;
}
public static class Book {
	String Title ;
	String Author;
}
}

