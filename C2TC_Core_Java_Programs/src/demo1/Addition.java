package demo1;
import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		int a,b,c;
		
		Scanner sc;
		sc = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		a = sc.nextInt();
		System.out.println("Enter b:");
		b= sc.nextInt();
		c=a+b;
		System.out.println("Addition:"+c);

	}

}
