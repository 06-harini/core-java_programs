package demo1;
import java.util.Scanner;

public class NearestNumber {

	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number");
		n = scanner.nextInt();
		while(n>=0) {
			if(n%10==0) {
				System.out.println(n);
				break;
			}
			n--;
		}
		
	}

}
