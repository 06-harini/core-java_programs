package demo1;
import java.util.Scanner;
public class DataTypes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter an intger:");
		int intvalue = scanner.nextInt();
		
		System.out.println("Enter a float value:");
		float floatvalue = scanner.nextFloat();
		
		System.out.println("Enter a double value: ");
		double doublevalue = scanner.nextDouble();
		
		System.out.println("Enter a long value:");
		long longvalue = scanner.nextLong();
		
		System.out.println("Enter a short value:");
		short shortvalue = scanner.nextShort();
		
		System.out.println("Enter a byte value:");
		byte bytevalue = scanner.nextByte();
		
		System.out.println("Enter boolean value:");
		boolean booleanvalue = scanner.nextBoolean();
		
		System.out.println("Enter a char:");
		char charvalue = scanner.next().charAt(0);
		
		System.out.println("Enter a string:");
		 scanner.nextLine(); // Consume leftover newline
	        String stringValue = scanner.nextLine();
	        
	        // Print all values
	        System.out.println("\n--- You entered ---");
	        System.out.println("Integer: " + intvalue);
	        System.out.println("Float: " + floatvalue);
	        System.out.println("Double: " + doublevalue);
	        System.out.println("Long: " + longvalue);
	        System.out.println("Short: " + shortvalue);
	        System.out.println("Byte: " + bytevalue);
	        System.out.println("Boolean: " + booleanvalue);
	        System.out.println("Character: " + charvalue);
	        System.out.println("String: " + stringValue);

		

	}

}
