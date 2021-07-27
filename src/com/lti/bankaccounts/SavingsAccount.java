package com.lti.bankaccounts;

public class SavingsAccount extends Account {
	private double minBalance; 
	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(String accountNumber, int balance, String password, double minBalance) {
		super(accountNumber, balance, password);
		this.minBalance=minBalance;
		// TODO Auto-generated constructor stub
	}

	public double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}
	
	

}
