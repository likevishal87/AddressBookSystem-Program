package com.bridgelabz;

public class AddressBook {

	String Firstname;
	String Lastname;
	String City;
	String State;
	int Zip;
	Contact contact;

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public int getZip() {
		return Zip;
	}

	public void setZip(int zip) {
		Zip = zip;
	}

	@Override
	public String toString() {
		return "AddressBook [Firstname=" + Firstname + ", Lastname=" + Lastname + ", City=" + City + ", State=" + State
				+ ", Zip=" + Zip + ", contact=" + contact + "]";
	}

	public AddressBook(Contact contact) {
		this.contact = contact;
	}

	public AddressBook(String firstname, String lastname, String city, String state, int zip, Contact contact) {
		
		this.Firstname = firstname;
		this.Lastname = lastname;
		this.City = city;
		this.State = state;
		this.Zip = zip;
		this.contact = contact;
	}

}
