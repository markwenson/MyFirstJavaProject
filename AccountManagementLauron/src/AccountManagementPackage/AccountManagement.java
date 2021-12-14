package AccountManagementPackage;

import java.util.Scanner;

class Person {
	String lastName;
	String firstName;
	String email;
	String contactNo;
}

class Credentials {
	String userName;
	String password;
}

class AccountType {
	char letterD = 'd';
	char letterU = 'u';
}


public class AccountManagement {
	
	static int menuOption = 0;
	static int updateOption = 0;
	static boolean loopContinue = true;
	static boolean accountCreated = false;
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		Person newObj = new Person();
		Credentials newObj2 = new Credentials();
		AccountType newObj3 = new AccountType();
		
		do {
			System.out.println("1. Create an Account\n"
					+ "2. Update an Account \n"
					+ "3. Display Account \n"
					+ "4. Exit");
			System.out.println("Select Menu by Number:");
			menuOption = reader.nextInt();
			
			switch (menuOption) {
			case 1:
				accountCreated = true;
				System.out.println("Create an Account");
				System.out.println("Enter Last Name:");
				newObj.lastName = reader.next();
				System.out.println("Last Name: " + newObj.lastName);
				
				System.out.println("Enter First Name:");
				newObj.firstName = reader.next();
				System.out.println("First Name: " + newObj.firstName);
				
				System.out.println("Enter UserName:");
				newObj2.userName = reader.next();
				System.out.println("UserName: " + newObj2.userName);
				
				System.out.println("Enter Password:");
				newObj2.password = reader.next();
				System.out.println("Password: " + newObj2.password);
				
				System.out.println("Enter Email:");
				newObj.email = reader.next();
				System.out.println("Email: " + newObj.email);
				
				System.out.println("Enter Contact Number:");
				newObj.contactNo = reader.next();
				System.out.println("Contact Number: " + newObj.contactNo +"\n");
				break;
			case 2:
				if (accountCreated) {
					System.out.println("Update an Account");
					System.out.println("Which Account attribute do you want to update?");
					System.out.println("1. Update Last Name \n" 
									 + "2. Update First Name \n" 
									 + "3. Updated UserName \n"
									 + "4. Updated Password \n" 
									 + "5. Update Email \n"
									 + "6. Update All \n");

					updateOption = reader.nextInt();

					if (updateOption == 1) {
						
						System.out.println("Update Last Name:");
						newObj.lastName = reader.next();
						System.out.println("Updated Last Name: " + newObj.lastName);
						
					} else if (updateOption == 2) {
						
						System.out.println("Update First Name:");
						newObj.firstName = reader.next();
						System.out.println("Updated First Name: " + newObj.firstName);
						
					} else if (updateOption == 3) {
						
						System.out.println("Update UserName:");
						newObj2.userName = reader.next();
						System.out.println("Updated UserName: " + newObj2.userName);
						
					} else if (updateOption == 4) {
						
						System.out.println("Update Password:");
						newObj2.password = reader.next();
						System.out.println("Updated Password: " + newObj2.password);
						
					} else if (updateOption == 5) {
						
						System.out.println("Update Email:");
						newObj.email = reader.next();
						System.out.println("Updated Email: " + newObj.email);
						
					} 
					else if (updateOption == 6) {

						System.out.println("Update Last Name:");
						newObj.lastName = reader.next();
						System.out.println("Updated Last Name: " + newObj.lastName);

						System.out.println("Update First Name:");
						newObj.firstName = reader.next();
						System.out.println("Updated First Name: " + newObj.firstName);

						System.out.println("Update UserName:");
						newObj2.userName = reader.next();
						System.out.println("Updated UserName: " + newObj2.userName);

						System.out.println("Update Password:");
						newObj2.password = reader.next();
						System.out.println("Updated Password: " + newObj2.password);
						
						System.out.println("Update Email:");
						newObj.email = reader.next();
						System.out.println("Updated Email: " + newObj.email);

						System.out.println("Update Contact Number:");
						newObj.contactNo = reader.next();
						System.out.println("Updated Contact Number: " + newObj.contactNo);
					} else {
						System.out.println("There is no such option!\n");
					}

					System.out.println("First Name: " + newObj.firstName);
					System.out.println("Last Name: " + newObj.lastName);
					System.out.println("User Name: " + newObj2.userName);
					System.out.println("Password: " + newObj2.password);
					System.out.println("Email: " + newObj.email);
					System.out.println("Contact Number: " + newObj.contactNo + "\n");
				} else {
					System.out.println("No Account to Update\n");
				}
				break;
			case 3:
				if (accountCreated) {
					System.out.println("Display Account");
					System.out.println("First Name: " + newObj.firstName);
					System.out.println("Last Name: " + newObj.lastName);
					System.out.println("User Name: " + newObj2.userName);
					System.out.println("Password: " + newObj2.password);
					System.out.println("Email: " + newObj.email);
					System.out.println("Contact Number: " + newObj.contactNo + "\n");
				} else {
					System.out.println("Account not yet created\n");
				}
				break;
			case 4:
				System.out.println("Exit");
				loopContinue = false;
				break;
			default:
				System.out.println("There is no such option!\n");
			}

		} while (loopContinue);
		reader.close();
	}
}
