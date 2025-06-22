package day3;
import java.util.Scanner;
public class ScannerDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Your Name:");
		String name = scanner.nextLine();
		
		System.out.println("Enter Your age:");
		int age = scanner.nextInt();
		
		System.out.println("Enter Your Salary:");
		double salary = scanner.nextDouble();
		
		System.out.println("Name"+name);
		System.out.println("Age"+age);
		System.out.println("Salary"+salary);
		
	}

}
