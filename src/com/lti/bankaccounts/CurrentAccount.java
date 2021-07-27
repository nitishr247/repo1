package com.lti.bankaccounts;

public class CurrentAccount extends Account {
	private double overdraftLimitAmount;

	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(String accountNumber, int balance, String password, double overdraftLimitAmount) {
		super(accountNumber, balance, password);
		this.overdraftLimitAmount=overdraftLimitAmount;
		// TODO Auto-generated constructor stub
	}

	public double getOverdraftLimitAmount() {
		return overdraftLimitAmount;
	}

	public void setOverdraftLimitAmount(double overdraftLimitAmount) {
		this.overdraftLimitAmount = overdraftLimitAmount;
	}
	

}
