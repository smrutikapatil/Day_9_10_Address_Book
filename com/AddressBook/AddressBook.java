package com.AddressBook;

import java.util.Scanner;

public class AddressBook {
	public static void main(String[] args) {
		System.out.println( "Welcome to Address Book" );
		AddressBook createContact = new AddressBook();
        System.out.println("Enter To Create Contact Details in Address Book  ");
        createContact.createContact();
    }
    public void createContact(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter Last Name: ");
        String lastName = sc.nextLine();
        System.out.println("Enter Address: ");
        String address = sc.nextLine();
        System.out.println("Enter City Name: ");
        String city = sc.nextLine();
        System.out.println("Enter State Name: ");
        String state = sc.nextLine();
        System.out.println("Enter Zip Code: ");
        int zipcode = sc.nextInt();
        System.out.println("Enter Phone Number: ");
        long phoneNumber = sc.nextLong();
        System.out.println("Enter Email  Address : ");
        String emailAddress = sc.next();
        System.out.println( "Contact has been Created !!" );
	}
		
}
