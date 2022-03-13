package com.credentials.app;
import java.util.*;

import com.credentials.model.*;
import com.credentials.service.*;

public class CredentialsGeneratorApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String domain;
		Employee e = new Employee("Harshith","Choudary");
		CredentialService cs = new CredentialService();
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");

		Scanner sc = new Scanner(System.in);
		
		int dept = sc.nextInt();
		sc.close();
		
		switch (dept) {
			case 1 : {
				domain = "tech";
				String email = cs.generateEmailAddress(e.getFirstname(), e.getLastname(), domain);
				char pwd[] = cs.generatePassword();
				cs.showCredentials(e.getFirstname(), email,pwd);
				break;
				
				}
			case 2 : {
				domain = "admin";
				String email = cs.generateEmailAddress(e.getFirstname(), e.getLastname(), domain);
				char pwd[] = cs.generatePassword();
				cs.showCredentials(e.getFirstname(), email,pwd);
				break;

			}
			case 3 :{
				domain = "hr";
				String email = cs.generateEmailAddress(e.getFirstname(), e.getLastname(), domain);
				char pwd[] = cs.generatePassword();
				cs.showCredentials(e.getFirstname(), email,pwd);
				break;

			}
			case 4: {
				domain = "legal";
				String email = cs.generateEmailAddress(e.getFirstname(), e.getLastname(), domain);
				char pwd[] = cs.generatePassword();
				cs.showCredentials(e.getFirstname(), email,pwd);
				break;
			}
			default: {
				System.out.println("Please make a selection from the above departments only!");
			}
		}
	}

}
