package com.AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	ArrayList<Person> phoneBook = new ArrayList<>();
	
	public static void main(String[] args) {
		System.out.println( "Welcome to Address Book" );
		AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Address book");
        int i = 0;
        while (i == 0) {
        System.out.println("\n***********Menu*************");
        System.out.println("1.Add Contact\n" + "2.Exit ");
        System.out.println("****************************");
        System.out.print("Choose option:");
        
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                addressBook.addContact();
                break;

            case 2:
                i = 1;
                break;
            default:
                System.out.println("Choose Correct Option!!!");
        }
    }

}
public void addContact() {
    Person person = new Person();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter To Create Contact Details in Address Book");
    
    System.out.println("Enter First Name:");
    person.setFirstName(sc.nextLine());
    
    System.out.println("Enter Last Name:");
    person.setLastName(sc.nextLine());
    
    System.out.println("Enter Address:");
    person.setAddress(sc.nextLine());
    
    System.out.println("Enter City Name :");
    person.setCityName(sc.nextLine());
    
    System.out.println("Enter State Name:");
    person.setState(sc.nextLine());
    
    System.out.println("Enter Email Address:");
    person.setEmailId(sc.nextLine());
    
    System.out.println("Enter zip code:");
    person.setZipcode(sc.nextInt());
    
    System.out.println("Enter Phone Number:");
    person.setPhoneNumber(sc.nextLong());
	
    phoneBook.add(person);
    
    System.out.println("New Contact has been Added!!!");
    }
}