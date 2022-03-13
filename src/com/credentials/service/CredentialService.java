package com.credentials.service;

import java.util.Random;



public class CredentialService {
	private char alpa[] = {'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m','1','2','3','4','5','6','7','8','9','0','Q','W','E','R','T','Y','U','I','O','P','A','S','D','F','G','H','J','K','L','Z','X','C','V','B','N','M'};
	
/** Generate random password String of 8 characters
 *  @return - Randomly generated password of 8 characters.
 */
	public char[] generatePassword(){
		char password[] = new char[8];;
		Random rand = new Random();
		for (int i=0 ;i<8;i++){
			int index = rand.nextInt(8);
			password[i] =alpa[index];
		}
		return password;
	}
	/**
	 *  Generates the email address for a user with firstNamelastName@department.company.com
	 * @param - FirstName of Employee
	 * @param - LastName of Employee
	 * @param - Dept of Employee
	 * @return - Email Address with firstNamelastName@department.company.com
	 * 
	 */
	
	public String generateEmailAddress(String firstname ,String lastname, String dept) {
		return firstname +lastname + "@" +dept+".company.com";
	}
	/**
	 * 
	 * @param firstname
	 * @param email
	 * @param p
	 */
	
	public void showCredentials(String firstname, String email, char p[]) {
		System.out.println("Dear "+firstname+", your credentials are as follows: " );
		System.out.println("Email --> " +email.toLowerCase());
		System.out.println("Password --> " +new String(p));
	}

}
