package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		AddressBookMethods entry = new AddressBookMethods();

		System.out.println("Welcome to Address Book Program in Java!");
		System.out.println(
				"You can create and modify Contacts in the Address Book with first/last names, address, city, state, zip, phone number and email and so on");

		entry.manageAddressBook();
	}
}
