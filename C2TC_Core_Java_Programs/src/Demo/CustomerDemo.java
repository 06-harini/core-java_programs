package Demo;

import java.util.Scanner;

import day3.Customer;

public class CustomerDemo {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String name, city;
		int id;
		System.out.print("Enter Customer Id : ");
		id=sc.nextInt();
	
		System.out.print("Enter Customer Name : ");
		name=sc.nextLine();
		
		System.out.print("Enter Customer City : ");
		city=sc.nextLine();

		
		System.out.println(" ");
		
		Customer c1=new Customer(name, id, city); //default constructor invoked
		c1.setCustomerName(name);
		c1.setCustomerId(id);
		c1.setCustomerCity(city);
		System.out.println(c1);
		
		System.out.print("Enter Customer Id : ");
		id=sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter Customer Name : ");
		name=sc.nextLine();
		
		System.out.print("Enter Customer City : ");
		city=sc.nextLine();
		
		
		Customer c2=new Customer(name, id, city); //parameterized constructor invoked);
		System.out.println(c2);
		
		
		System.out.print("Enter Customer Id : ");
		id=sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter Customer Name : ");
		name=sc.nextLine();
		
		System.out.print("Enter Customer City : ");
		city=sc.nextLine();
		
		
		Customer c3=new Customer(name, id, city); //parameterized constructor invoked);
		System.out.println(c3);
		
		sc.close();
		

	}
	}
		