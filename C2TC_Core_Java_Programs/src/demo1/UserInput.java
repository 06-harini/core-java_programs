package demo1;
import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = scanner.nextLine();
		
		System.out.println("Rate us from 1 to 5:");
		int rating = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Enter Your Email:");
		String email = scanner.nextLine();
		
		System.out.println("Hello"+name);
		System.out.println("Your rating is:" + rating);
		System.out.println("Email is" + email);

	}

}
