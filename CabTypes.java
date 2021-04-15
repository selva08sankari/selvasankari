package com.selvasankari;

import java.util.Scanner;

public class CabTypes {
	public static void selectCab()
	{
		System.out.println("Enter the cabtype mini/micro/prime:");
		Scanner sc=new Scanner(System.in);
		String cabName=sc.nextLine();
		if(cabName.equalsIgnoreCase("MICRO") || cabName.equalsIgnoreCase("MINI") || cabName.equalsIgnoreCase("PRIME"))
		{
			PriceEstimator.billAmount(cabName);
		}
		else
		{
			System.out.println("Please select mentioned cabtype");
			selectCab();
		}
	}
}
