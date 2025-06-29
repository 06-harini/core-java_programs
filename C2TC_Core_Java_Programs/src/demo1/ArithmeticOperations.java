package demo1;
import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		System.out.println("Enter FIrst Number:");
		int num1 = Scanner.nextInt();
		
		System.out.println("Enter Scond Number:");
		int num2 = Scanner.nextInt();
		
		System.out.println("Addition: " +(num1+num2));
		System.out.println("Subtraction" +(num1-num2));
		System.out.println("Multiplication" +(num1*num2));
		System.out.println("Division" +(num1/num2));
		System.out.println("Modulus" +(num1%num2));
		
		

	}

}
