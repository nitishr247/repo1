package com.lti.bankaccounts;

public class Account {
	private String accountNumber;
	private int balance;
	private String password;

	private static String bankName="HDFC";

	public Account() {

	}

	public Account(String accountNumber, int balance, String password) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.password = password;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static String getBankName() {
		return bankName;
	}

	public static void setBankName(String bankName) {
		Account.bankName = bankName;
	}
	
	

}
