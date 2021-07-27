package com.lti.main;

//import com.lti.bankaccounts.Account;
import com.lti.bankaccounts.SavingsAccount;

public class Display {
	public void displayAccDeets(SavingsAccount account) {
		System.out.println("acc no: " + account.getAccountNumber() + "balance: " + account.getBalance() + "password: "
				+ account.getPassword() +"min bal: "+account.getMinBalance()+ "bank name: " + SavingsAccount.getBankName());
	}

	public void displayAccDeets(SavingsAccount[] accounts) {
		for (SavingsAccount act : accounts) {
			displayAccDeets(act);
		}
	}

}
