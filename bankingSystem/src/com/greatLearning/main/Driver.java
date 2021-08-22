package com.greatLearning.main;

import java.util.Scanner;

import com.greatLearning.models.customer;
import com.greatLearning.service.bankingService;

public class Driver {
	public static void main(String[] args) {
		
		bankingService bankingServiceObj=new bankingService();
		
		customer customer1=new customer("Ayush@12","1121",0);
	//	customer customer2=new customer("Ayush@12","11210108");
		
		Scanner sc=new Scanner(System.in);
		
		String password;
		String accountNo;
		
		System.out.println("Welcome to the login page");
		
		System.out.println();
		
		System.out.println("Enter your account number");
		accountNo=sc.next();
		
		System.out.println("Enter your password number");
		password=sc.next();
	
		customer loggedInCustomer =new customer();
		loggedInCustomer.setPassword(password);
		loggedInCustomer.setBankAccounts(accountNo);
		
		if(validate(loggedInCustomer,customer1))	
			
		{
			int option=0;
			
			do{
				System.out.println();
				System.out.println("===========================================================");
				System.out.println("Available opeartions");
				System.out.println("1. Deposit");
				System.out.println("2. Withdrawal");
				System.out.println("3. Transfer");
				System.out.println("0. logout");
				System.out.println("===========================================================");
				System.out.println("Select an operation");
				option=sc.nextInt();
				
				switch (option) {
				case 0:
					option=0;
					bankingServiceObj.logout();
					break;

				case 1:
					bankingServiceObj.deposit(loggedInCustomer);
					break;
				case 2:
					bankingServiceObj.withdrawal(loggedInCustomer,"Withdraw");
					break;
				case 3:
					bankingServiceObj.transfer(loggedInCustomer);
					break;
				default:
					System.out.println("Invalid Operation");
					break;
				
				}
				
			}while(option!=0);
		}
		else
		{
			
			System.out.println("Enter valid credentials");
		}
	}

	private static boolean validate(customer loggedInCustomer,
			customer customer1) {
		// TODO Auto-generated method stub
//		System.out.println(loggedInCustomer.getBankAccounts());
//		System.out.println(loggedInCustomer.getPassword());
		return(loggedInCustomer.getBankAccounts().equals(customer1.getBankAccounts()) && loggedInCustomer.getPassword().equals(customer1.getPassword()));
			}
	

}
