package com.greatLearning.models;

public class customer {

	private	String password;
	private String bankAccountNo;
	private int balance;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public customer(String password, String bankAccountNo,int balance) {
		super();
		this.password = password;
		this.bankAccountNo = bankAccountNo;
		this.balance=balance;
	}
	public customer() {
		// TODO Auto-generated constructor stub
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBankAccounts() {
		return bankAccountNo;
	}
	public void setBankAccounts(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}
	
	
	

}
