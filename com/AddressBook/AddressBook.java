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
            System.out.println("1.Add Contact\n" + "2.Edit Contact\n" + "3.Exit ");
            System.out.println("******************************");
            System.out.print("Choose option:");
            
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addressBook.addContact();
                    break;
                    
                case 2:
                    addressBook.editContact();
                    break;

                case 3:
                    i = 1;
                    break;
                default:
                    System.out.println("Choose Correct Choice!!");
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
 public void editContact() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Confirm your first Name To Edit details : ");
	String confirmName = sc.nextLine();
	
	for (int i = 0; i < phoneBook.size(); i++) {
		if(phoneBook.get(i).getFirstName().equals(confirmName)) {
			System.out.println("Select forn below to change:");
			System.out.println("\n1.First Name\n2.Last Name\n3.Address\n4.City\n5.State\n6.Zip code\n7.Phone number\n8.Email Address");
			int edit = sc.nextInt();
			
			switch (edit) {
			case 1:
				System.out.println("Enter First Name");
				phoneBook.get(i).setFirstName(sc.next());
				break;
			case 2:
				System.out.println("Enter Last Name");
				phoneBook.get(i).setLastName(sc.next());
				break;
			case 3:
				System.out.println("Enter Address");
				phoneBook.get(i).setAddress(sc.next());
				break;
			case 4:
				System.out.println("Enter City");
				phoneBook.get(i).setCityName(sc.next());
				break;
			case 5:
				System.out.println("Enter State");
				phoneBook.get(i).setState(sc.next());
				break;
			case 6:
				System.out.println("Enter Zip Code");
				phoneBook.get(i).setZipcode(sc.nextInt());
				break;
			case 7:
				System.out.println("Enter Phone Number");
				phoneBook.get(i).setPhoneNumber(sc.nextLong());
				break;
			case 8:
				System.out.println("Enter Email Address");
				phoneBook.get(i).setEmailId(sc.next());
				break;
			default:
				System.out.println("Please Enter valid option!! ");
				break;
				}
			}	
		else {
			System.out.println("Please Enter Valid Name !!");
		   }
		}
 	}
}