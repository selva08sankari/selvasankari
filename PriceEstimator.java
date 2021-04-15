package com.selvasankari;

import java.util.Scanner;

public class PriceEstimator {
	public static void billAmount(String cabName)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the distance in Km:");
		float distance = sc.nextInt();		
		if(cabName.equalsIgnoreCase("MICRO"))  //micro type cab bill amount calculation
		{
			float total = distance*10;
			
			System.out.println("Your Total Bill Amount : " +total);
			GstCalculation.gst(total,distance);
		}
		
		else if(cabName.equalsIgnoreCase("MINI"))  //mini type cab bill amount calculation
		{
			float total = distance*15;
			
			System.out.println("Your Total Bill Amount : " +total);
			GstCalculation.gst(total,distance);
		}
		
		else   //prime type cab bill amount calculation
		{
			float total = distance*20;
			System.out.println("    PRICE ESTIMATION    ");
			System.out.println("Bill Amount : "+total);
			GstCalculation.gst(total,distance);
		}
		
	}
}
