package com.selvasankari;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import java.util.Scanner;

public class SeniorCitizen {
	public static void finalAmountCalculation(float peakHoursRate)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Date Of Birth [*yyyy-mm-dd] : ");
		String dobstr=sc.nextLine();   //yyyy-mm-dd
		LocalDate dateOfBirth = LocalDate.parse(dobstr);
		LocalDate currentDate = LocalDate.now();
		int dobYear=dateOfBirth.getYear();
		int currentYear=currentDate.getYear();
		int age=currentYear-dobYear;
		if(age>=60)
		{
			System.out.println("Your age is : "+age+"Special Discount for senior Citizen");
			float finalAmount=(50*peakHoursRate)/100;
			System.out.println("Your Final Amount is : "+finalAmount);
		}
		else
		{
			float finalAmount=peakHoursRate;
			System.out.println("Your Final Amount is : "+finalAmount);
		}
		
	}

}
