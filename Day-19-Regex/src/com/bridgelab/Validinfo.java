package com.bridgelab;

import java.util.Scanner;

public class Validinfo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter first name");
		String firstname = scanner.nextLine();
		
		System.out.println("enter last name");
		String lastname = scanner.nextLine();
		
		System.out.println("enter email name");
		String emailid = scanner.nextLine();
		
		System.out.println("invalid result");
		
		if (!validatefirstname(firstname))
			System.out.println("invalid first name");
		else
			if (!validatelastname(lastname))
				System.out.println("invalid last name");
			else
				if(!validateemailid(emailid))
					System.out.println("invalid email");
			else

		System.out.println("enter valid info");

		
	}
	//validate first name;-----
	public static boolean validatefirstname(String firstname) {
		return firstname.matches("[A-Z]{1}[a-z]{3,6}");
	}
	//lastname
	public static boolean validatelastname(String lastname) {
		return lastname.matches("[A-Z]{1}[a-z]{3,6}");
	}
	//email id
	public static boolean validateemailid(String emailid) {
		return emailid.matches("^\\\\w+([_+.-]\\\\w+)?@\\\\w+.[a-zA-Z]{2,3}([.][a-zA-Z]{2})?$\";");
	}


}
