package com.capg.addressBook;

import java.util.*;
public class AddressBookMain
{
	int numOfContact=0;
	private ArrayList<Contact> contactArray;
	private Map<String,Contact> contactMap;
	public AddressBookMain()
	{
		contactArray=new ArrayList<>();
		contactMap=new HashMap<>();
	}
	public void addNewContact(String firstName,String lastName,String address,String city,String state,String pinCode,String phoneNumber,String emailId)
	{
		Contact obj=new Contact(firstName,lastName,address,city,state,pinCode,phoneNumber,emailId);
		contactArray.add(obj);
		contactMap.put(firstName,obj);
	}
	public void printContact()
	{
	System.out.println(contactArray);
	}
	public void editContact()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The First Name to edit the contact details");
		String firstName=sc.next();
		Contact obj=contactMap.get(firstName);
		System.out.println("Enter the Address");
		String address=sc.next();
		obj.setAddress(address);
		System.out.println("Enter the City");
		String city=sc.next();
		obj.setCity(city);
		System.out.println("Enter the State");
		String state=sc.next();
		obj.setState(state);
		System.out.println("Enter the Pincode");
		String pin=sc.next();
		obj.setZip(pin);
		System.out.println("Enter the Number");
		String mobile=sc.next();
		obj.setMobile(mobile);
		System.out.println("Enter the Email");
		String email=sc.next();
		obj.setEmail(email);
	}
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);	
	System.out.print("Enter FirstName,Last Name,address,city,state,pincode,phonenumber,email");
	String fname=sc.next();
	String lname=sc.next();
	String addressNew=sc.next();
	String cityNew=sc.next();
	String stateNew=sc.next();
	String zip=sc.next();
	String mobiileNumber=sc.next();
	String email=sc.next();
	AddressBookMain Contact1=new AddressBookMain();
	Contact1.addNewContact(fname,lname,addressNew,cityNew,stateNew,zip,mobiileNumber,email);
	Contact1.printContact();
	Contact1.editContact();
	System.out.println("After Editing:");
	Contact1.printContact();
	}
}
