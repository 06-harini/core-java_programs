package Demo;

public class StudentDemo {

	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s);
		
		Student s1 = new Student();
		s1.setSid(102);
		s1.setSname("harini");
		s1.setScourse("Java");
		System.out.println(s1);
	}

}
