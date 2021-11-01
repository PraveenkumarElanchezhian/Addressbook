package Practiceproblem;

import java.util.Scanner;

public class AddressBookSystem {
	public static void main(String[] args) {
		AddressBookSystem rv = new AddressBookSystem();
		rv.address();
	}

	// Address book for single person
	public void address() {
		Scanner address = new Scanner(System.in);
		System.out.println("Enter first name");
		String Firstname = address.nextLine();
		System.out.println("Enter last name");
		String Lastname = address.nextLine();
		System.out.println("Enter Address");
		String Address = address.nextLine();
		System.out.println("Enter State");
		String State = address.nextLine();
		System.out.println("Enter Zip");
		String Zip = address.nextLine();
		System.out.println("Enter Phone number");
		long Phone_number = address.nextLong();
		System.out.println("Enter email");
		String email = address.next();
		System.out.println("Firstname : "+Firstname);
		System.out.println("Lastname : "+Lastname);
		System.out.println("Address : "+Address);
		System.out.println("State : "+State);
		System.out.println("Zip : "+Zip);
		System.out.println("Phone number : "+Phone_number);
		System.out.println("Email : "+email);
	}
	
}
