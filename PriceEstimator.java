package com.selvasankari;

import java.util.Scanner;

public class PriceEstimator {
	public static void billAmount(String cabName)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the distance in Km:");  //get the killometer from user
		float distance = sc.nextInt();		
		if(cabName.equalsIgnoreCase("MICRO"))  //bill amount calculation for microcab
		{
			float total = distance*10;
			
			System.out.println("Your Total Bill Amount : " +total);
			GstCalculation.gst(total,distance);
		}
		
		else if(cabName.equalsIgnoreCase("MINI"))  //bill amount calculation for minicab
		{
			float total = distance*15;
			
			System.out.println("Your Total Bill Amount : " +total);
			GstCalculation.gst(total,distance);
		}
		
		else                                       //bill amount calculation for primecab
		{
			float total = distance*20;
			System.out.println("    PRICE ESTIMATION    ");
			System.out.println("Bill Amount : "+total);
			GstCalculation.gst(total,distance);
		}
		
	}
}
