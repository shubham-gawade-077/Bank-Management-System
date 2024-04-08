package com.braindata.bankmanagement.serviceImp1;
import com.braindata.bankmanagement.service.Rbi;
import com.braindata.bankmanagement.model.Account;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sbi implements Rbi 
{

	Scanner sc=new Scanner(System.in);

	Account a=new Account();
   
	  double newBalance=0;
   
	public void createAccount() {
		
		System.out.print("Enter your account No:");		//accNo
		int x=sc.nextInt();
		int temp=x;
		int count=0;
		while(x!=0)
		{
			int rem=x%10;
			x=x/10;
			count++;
		}
		if(count==8)
		{
			a.setAccNo(temp);
		}
		else
		{
			System.out.println("Invalid accNo!!!");
		    System.exit(0);
		}
		
		System.out.print("Enter your name:");     //name
		String name=sc.next()+sc.nextLine();
		if(name.matches("[a-zA-Z ]*")) 
			a.setName(name);
		else {
			System.out.println("Enter a valid name..!");
			System.exit(0);
		}
		
		System.out.print("Enter your mob No:");	//mobNo
		String s3=sc.next();
		int i=0;
		int count1=0;
		if(s3.matches("[0-9]*"))
		{
		for(i=0;i<s3.length();i++)
		{
			if(s3.charAt(i)!=' ')
			{
				count1++;
			}
		}
		}
		if(count1==10)
		{
			
			a.setMobNo(s3);
		}
		else
		{
			System.out.println("Invalid mobNo");
			System.exit(0);
		}
		
		System.out.print("Enter your adharNo:");	//adharNo
		String s1=sc.next();
		int j=0;
		int count2=0;
		if(s1.matches("[0-9]*"))
		{
		for(j=0;j<s1.length();j++)
		{
			if(s1.charAt(j)!=' ')
			{
				count2++;
			}
		}
		}
		if(count2==12)
		{
			a.setAdharNo(s1);
		}
		else
		{
			System.out.println("Enter a valid adhar no...!");
			System.exit(0);
		}
		
		System.out.print("Enter your gender:");	//gender
		String s2=sc.next();
		if ("M".equalsIgnoreCase(s2) || "F".equalsIgnoreCase(s2) || "male".equalsIgnoreCase(s2) || "female".equalsIgnoreCase(s2)) 
		{
		    a.setGender(s2);
		} 
		else 
		{
		    System.out.println("Invalid gender Input..!!");
		    System.exit(0);
		}
	
		System.out.print("Enter your age:");		//age
		int x1=sc.nextInt();
		if(x1>=18)
			a.setAge(x1);
		else
		{
			System.out.println("You are underAge!!!");
			System.exit(0);
		}
		
		System.out.print("Enter your balance:");	//balance
		double d1=sc.nextDouble();
		if(d1>=0)
			a.setBalance(d1);
		else
		{
			System.out.println("Invalid Input of balance....!!");
			System.exit(0);
		}
		System.out.println("\n"+a);
	}

	
	public void displayAllDetails() {
		
		System.out.println("AccNo:- "+a.getAccNo());
		
		System.out.println("AccHolder Name:- "+a.getName());
		
		System.out.println("Mob No:- "+a.getMobNo());
		
		System.out.println("Adhar No:- "+a.getAdaharNo());
		
		System.out.println("Gender:- "+a.getGender());
		
		System.out.println("accHolder Age:- "+a.getAge());
		
		System.out.println("accBalance:- "+a.getBalanace());
		
		
	}

	
	public void depositeMoney() {
		
		System.out.println("Enter amount to be deposited:-");
		double d=sc.nextDouble();
	    newBalance=a.getBalanace()+d;
		System.out.println("Current Balance:- "+ newBalance);

	}

	
	public void withdrawal() {
		
		System.out.println("Enter amount to be withdrawal:- ");
		double d1=sc.nextDouble();
		newBalance=newBalance-d1;
		System.out.println("Current Balance:- "+newBalance);
		a.setBalance(newBalance);
		
	}

	
	public void balanceCheck() {
		
		System.out.println("Current Balance:- "+a.getBalanace());
		
	}
	
	
}
