package com.selvasankari;

import java.util.Scanner;

public class LoginPage {
	public static void mobileNumber()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Mobile Number:");
		Long mobileNo=sc.nextLong();
		String mobileNum=String.valueOf(mobileNo);
		
		if(mobileNum.length()==10)
		{
            passWord();
		}
			else
			{		    	
				System.out.println("Invalid Mobile Number.please provide 10 digit number");
				mobileNumber();
			}
	}
	public static void passWord()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Password:");
		String password =sc.nextLine();
		if(password.length()==8)
		{
			System.out.println("    Password Verified successfully    ");
			CabTypes.selectCab();
		}
		else
		{
			System.out.println("Invalid Password.Please provide 8 digit passward");
			passWord();
		}
	}
	public static void main(String[] args) {
		mobileNumber();
}
}
