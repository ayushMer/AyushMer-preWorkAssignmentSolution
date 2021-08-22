package com.greatLearning.service;

import java.util.Scanner;

import com.greatLearning.models.customer;

public class bankingService {

	Scanner sc=new Scanner(System.in);
	
	public void logout() {
		// TODO Auto-generated method stub
		System.out.println("Thank you for banking with us");
	}

	public void deposit(customer custobj) {
		
		// TODO Auto-generated method stub
		int amount;
		System.out.println("Enter amount to be deposited");
		amount=sc.nextInt();
		
		if(amount>0)
		{
			System.out.println("Amount deposited successfully");
			custobj.setBalance(amount+custobj.getBalance());
			System.out.println("Current Balance is "+custobj.getBalance());
		}
		
	}

	public void withdrawal(customer loggedInCustomer,String operation) {
		// TODO Auto-generated method stub
		
		int amount;
		System.out.println("Enter the amount to "+operation);
		amount=sc.nextInt();
		
		int actualBalance=loggedInCustomer.getBalance();
		
		if(amount<=actualBalance)
			{
				System.out.println("Amount "+operation+" successfully");
				loggedInCustomer.setBalance(loggedInCustomer.getBalance()-amount);
				System.out.println("Remaining balance "+loggedInCustomer.getBalance());
			}
		else
		{
			System.out.println("Insufficent funds");
		}
	}

	public void transfer(customer loggedInCustomer) {
		// TODO Auto-generated method stub
		int amount;
		int otp;
		int  otpGenerated;
		int amountToTransfer;
		
		OTPservice otpObj=new OTPservice();
		otpGenerated=otpObj.generateOTP();
		System.out.println("Generated OTP "+otpGenerated);
		
		System.out.println("Enter the OTP");
		otp=sc.nextInt();
		
		if(otp==otpGenerated)
		{
			//System.out.println("Enter amount to be transferred");
			//amountToTransfer=sc.nextInt();
			withdrawal(loggedInCustomer,"Transfer");
			
//
//			int actualBalance=loggedInCustomer.getBalance();
//			
//			if(amountToTransfer<=actualBalance)
//				{
//					System.out.println("Amount Transferred successfully");
//					loggedInCustomer.setBalance(loggedInCustomer.getBalance()-amountToTransfer);
//					System.out.println("Remaining balance "+loggedInCustomer.getBalance());
//				}
//			else
//			{
//				System.out.println("Insufficent funds");
//			}
			
		}
		else
		{
			System.out.println("OTP incorrect");
		}
	}
	
	
	

}
