package com.braindata.bankmanagement.model;

public class Account {
	
	private int accNo;
	private String name;
	private String mobNo;
	private String adharNo;
	private String gender;
	private int age;
	private double balance;
	
	public void setAccNo(int accNo)
	{
		this.accNo=accNo;
	}
	
	public int getAccNo()
	{
		return accNo;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setMobNo(String mobNo)
	{
		this.mobNo=mobNo;
	}
	public String getMobNo()
	{
		return mobNo;
	}
	public void setAdharNo(String adharNo)
	{
		this.adharNo=adharNo;
	}
	public String getAdaharNo()
	{
		return adharNo;
	}
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	public String getGender()
	{
		return gender;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public double getBalanace()
	{
		return balance;
	}
	@Override
	public String toString() {
		return "Account [Acc_No=" + accNo + ", Name=" + name + ", Mob_No=" + mobNo + ", Adhar_No=" + adharNo + ", Gender="
				+ gender + ", Age=" + age + ", Balance=" + balance + "]";
	}

}
