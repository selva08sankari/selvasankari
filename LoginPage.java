package com.selvasankari;

import java.util.Scanner;

public class LoginPage {
	public static void mobileNumber()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Mobile Number:");  
		Long mobileNo=sc.nextLong();                      // Get the mobile number from user
		String mobileNum=String.valueOf(mobileNo);
		
		if(mobileNum.length()==10)
		{
                        passWord();                              //if mobilenumber is validated call the password method
		}
			else
			{		    	
				System.out.println("Invalid Mobile Number.please provide 10 digit number");
				mobileNumber();                  //if mobilenumber is not valid call the same method to reenter
			}
	}
	public static void passWord()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Password:");
		String password =sc.nextLine();                  //Get the password from user
		if(password.length()==8)
		{
			System.out.println("    Password Verified successfully    ");   
			CabTypes.selectCab();                    //call the next method to select the cabtype
		}
		else
		{
			System.out.println("Invalid Password.Please provide 8 digit passward");
			passWord();                              //if password is not valid call the same method to reenter
		}
	}
	public static void main(String[] args) {
		mobileNumber();                                 // call the method to proceed the login details
}
}
