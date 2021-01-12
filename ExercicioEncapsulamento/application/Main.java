package application;

import java.util.Scanner;

import entities.BankAccount;

public class Main {
	public static void main (String[] args) {
		
		String holder;
		int accountNumber;
		double deposit = 00.00, withdraw;
		BankAccount bankAccount;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		accountNumber = sc.nextInt();
		System.out.println("");
		System.out.print("Enter account holder: ");
		sc.nextLine();
		holder = sc.nextLine();
		System.out.println("");
		System.out.print("Is there an initial deposit? (y/n) ");
		if(sc.next().charAt(0) == 'y') {
			System.out.println("");
			System.out.print("Enter initial deposit value: ");
			deposit = sc.nextDouble();
			bankAccount = new BankAccount(holder, accountNumber, deposit);
		} else {
			bankAccount = new BankAccount(holder, accountNumber);
		}
		
		
		System.out.println("Account Data: ");
		System.out.println(bankAccount.toString());
		
		System.out.print("Enter a deposit value: ");
		deposit = sc.nextDouble();
		bankAccount.deposit(deposit);
		System.out.println("Account Data: ");
		System.out.println(bankAccount.toString());
		
		System.out.print("Enter a withdraw value: ");
		withdraw = sc.nextDouble();
		bankAccount.withdraw(withdraw);
		System.out.println("Account Data: ");
		System.out.println(bankAccount.toString());
		
		sc.close();
	}
}
