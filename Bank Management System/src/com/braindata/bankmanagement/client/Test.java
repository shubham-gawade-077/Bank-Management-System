package com.braindata.bankmanagement.client;
import com.braindata.bankmanagement.service.Rbi;
import com.braindata.bankmanagement.serviceImp1.Sbi;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Rbi bank=new Sbi();
		
		
		while(true)
		{
		System.out.println(" \n\t----------------------------------");
		
		System.out.println("*****----^^^^^^Welcome to XYZ Bank^^^^------*****");
		
		System.out.println(" \t----------------------------------");
		
		System.out.println("\n##-------------Enter Choice--------------##\n1.Create Account "
                                                           + "\t2.DisplayAlldetails "
                                                           +"\n3.Deposite Money "
                                                           + "\t4.Withdrawal Money "
                                                           + "\n5.Balance Check ");
		
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("--------Create Account--------\n");
			bank.createAccount();
			break;
		case 2:
			System.out.println("--------Account holder Details--------\n");
			bank.displayAllDetails();
			break;
		case 3:
			System.out.println("-------Money Deposit------\n");
			bank.depositeMoney();
			break;
		case 4:
			System.out.println("------Money Withdrawal-----\n");
			bank.withdrawal();
			break;
		case 5:
			System.out.println("-----Account Balance-----\n");
			bank.balanceCheck();
			break;
		default:
			System.out.println("Invalid Choice!!!!\n");
			System.exit(0);
		}
	}
	
	}
}
