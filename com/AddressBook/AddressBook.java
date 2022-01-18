package com.AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
ArrayList<Person> phoneBook = new ArrayList<>();
	
	public static void main(String[] args) {
		System.out.println( "Welcome to Address Book" );
		Scanner scanner = new Scanner(System.in);
		AddressBook addressBook = new AddressBook();
	    addressBook.getMenu();
	    addressBook.showContact();
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
	int found = 0;
	for (int i = 0; i < phoneBook.size(); i++) {
		if(phoneBook.get(i).getFirstName().equals(confirmName)) {
			System.out.println("Select forn below to change:");
			System.out.println("\n1.First Name\n2.Last Name\n3.Address\n4.City\n5.State\n6.Zip code\n7.Phone number\n8.Email Address");
			System.out.print("Choose option:");

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
			found++;
			}
		 }
		if (found == 0) {
			System.out.println("Please Enter Valid Name !!");
		}
 }
 public void deleteContact() {
	 Scanner sc = new Scanner(System.in);
		System.out.println("Enter firstName of the person");
		String deleteName = sc.next();
		int found = 0;
	    for (int i = 0; i < phoneBook.size(); i++) {
	    	if(phoneBook.get(i).getFirstName().equals(deleteName)) {
	    		System.out.println(phoneBook.get(i).getFirstName() + " Deleted.... ");
	    		phoneBook.remove(i);
	    		found++;
	    		}
	        }
	    	if (found == 0) {
	    		System.out.println("Please Enter Valid Name !!");
	    		}
	
 }
public void showContact() {
	    System.out.println("Total Number of Contacts : " + phoneBook.size());
	    System.out.println("********************************************");
	    if (phoneBook.isEmpty()) {
	        System.out.println("There are no contacts in the contact list");
	    } 
	    else {
	        System.out.println(phoneBook);
	        System.out.println("\n*********************************************");
	    }
}
public void getMenu() {
		Scanner sc = new Scanner(System.in);
	    boolean exit = false;
	    do {
	        System.out.println("\n1. Add Contact \n2. Edit Contact \n3. Delete Contact \n4. View Contacts \n5. Exit ");
	        System.out.print("Choose option:");
	        int option = sc.nextInt();
	        sc.nextLine();
	        switch (option) {
	            case 1:
	                addContact();
	                System.out.println(phoneBook);
	                break;
	            case 2:
	                editContact();
	                System.out.println(phoneBook);
	                break;
	            case 3:
	                deleteContact();
	                break;
	            case 4:
	                showContact();
	                break;
	            case 5:
	                exit = true;
	                break;
	            default:
	               System.out.print("Enter the Valid Option!");
	                break;
	        }
	    } 
	    while (!exit);
	 }
}