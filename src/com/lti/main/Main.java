package com.lti.main;

import java.util.Random;
import java.util.Scanner;

import com.lti.bankaccounts.Account;
import com.lti.bankaccounts.SavingsAccount;

public class Main {

	public static void main(String[] args) {

		scenario2();

		// cricStats();

	}

	public static void scenario1() {
		Scanner sc = new Scanner(System.in);
		int numberOfAccounts = sc.nextInt();
		Account[] accounts = new Account[numberOfAccounts];

		for (int i = 0; i < numberOfAccounts; i++) {
			System.out.println("enter yor bank details-account number,balance and password");
			String accNo = sc.next();
			int accBal = sc.nextInt();
			String password = sc.next();
			accounts[i] = new Account(accNo, accBal, password);

		}
		Display display = new Display();
		// display.displayAccDeets(accounts);
	}

	public static void scenario2() {
		Scanner sc = new Scanner(System.in);
		int numberOfAccounts = sc.nextInt();
		SavingsAccount[] accounts = new SavingsAccount[numberOfAccounts];

		for (int i = 0; i < numberOfAccounts; i++) {
			System.out.println("enter yor bank details-account number,balance and password");
			String accNo = sc.next();
			int accBal = sc.nextInt();
			String password = sc.next();
			double minBalance = sc.nextDouble();
			accounts[i] = new SavingsAccount(accNo, accBal, password, minBalance);

		}
		Display display = new Display();
		display.displayAccDeets(accounts);

	}

	public static void electricityBill() {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter your number of units");
		int numberOfUnits = sc.nextInt();
		if (numberOfUnits <= 100) {
			System.out.println("your bill amount is : " + numberOfUnits * 1.2);
		} else if (numberOfUnits <= 300) {
			System.out.println("your bill amount is : " + (120 + (numberOfUnits - 100) * 2));
		} else if (numberOfUnits > 300) {
			System.out.println("your bill amount is : " + ((numberOfUnits - 300) * 3 + 120 + 400));

		}
	}

	public static void cricStats() {
		Random random = new Random();
		int totalRuns = 0;
		int ones = 0;
		int twos = 0;
		int threes = 0;
		int fours = 0;
		int sixes = 0;
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 30; i++) {

				int runs = random.nextInt(6) + 1; // random no between 1 and 6
				totalRuns += runs;
				switch (runs) {
				case 1:
					ones += 1;
					break;
				case 2:
					twos += 1;
					break;
				case 3:
					threes += 1;
					break;
				case 4:
					fours += 1;
					break;
				case 6:
					sixes += 1;
					break;
				}
			}
		}
		float strikeRate = totalRuns / 150;
		System.out.println("total runs: " + totalRuns + " no of 1s: " + ones + " no of 2s: " + twos + " no of 3s: "
				+ threes + " no of 4s: " + fours + " no of 6s: " + sixes + " strike rate: " + strikeRate);

	}

}
