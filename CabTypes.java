package com.selvasankari;

import java.util.Scanner;

public class CabTypes {
	public static void selectCab()
	{
		System.out.println("Enter the cabtype mini/micro/prime:");   
		Scanner sc=new Scanner(System.in);
		String cabName=sc.nextLine();                           //Get the cab type from user
		if(cabName.equalsIgnoreCase("MICRO") || cabName.equalsIgnoreCase("MINI") || cabName.equalsIgnoreCase("PRIME"))
		{
			System.out.println("Your cabtype is selected");
			PriceEstimator.billAmount(cabName);             //call the next class->method to calculate Bill Amount
		}
		else
		{
			System.out.println("Please select mentioned cabtype");
			selectCab();                                   //if cabtype is not mentioned above call the same method to reenter
		}
	}
}
