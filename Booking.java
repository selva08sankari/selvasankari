package com.selvasankari;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import java.util.Scanner;

public class Booking {

	public static void pickUpTime(float totalgst,float distance)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the journey time [*HH : MM : SS] : ");
		String traveltime=sc.nextLine();   //HH : MM : SS
		LocalTime cabPickUpTime= LocalTime.parse(traveltime);		
		LocalTime currentTime=LocalTime.now();
		if(cabPickUpTime.isAfter(currentTime))
		{
			System.out.println("     Please wait a minute....");
			PeakHours.excessRate(totalgst,cabPickUpTime,distance);
			
		}
		else if(cabPickUpTime == currentTime)
		{
			System.out.println("selva");
			PeakHours.excessRate(totalgst,cabPickUpTime,distance);
		}
		else if(cabPickUpTime.isBefore(currentTime))
		{
			System.out.println("    Please provide a valid date    ");
			pickUpTime(totalgst,distance);
		}
	}
	public static void journeyDate(float totalgst,float distance) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the journey date [*yyyy-mm-dd] : ");
		String traveldate=sc.nextLine();   //yyyy-mm-dd
		LocalDate  travelDate= LocalDate.parse(traveldate);
		LocalDate currentDate=LocalDate.now();
		if(travelDate.isAfter(currentDate))
		{
			pickUpTime(totalgst,distance);
			
		}
		else if((travelDate == currentDate))
		{
			pickUpTime(totalgst,distance);
		}
		else if(travelDate.isBefore(currentDate))
		{
			System.out.println("   Please provide a valid date   ");
			journeyDate(totalgst,distance);
		}
	}

}
