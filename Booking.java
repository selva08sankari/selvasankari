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
		String traveltime=sc.nextLine();   //HH : MM : SS                 //get the pickup time from user
		LocalTime cabPickUpTime= LocalTime.parse(traveltime);		  //convert the string localdata(parse method)
		LocalTime currentTime=LocalTime.now();                            //call now() to get current date
		if(cabPickUpTime.isAfter(currentTime))                            //time should be in current and future
		{
			System.out.println("     Please wait a minute....    "); 
			PeakHours.excessRate(totalgst,cabPickUpTime,distance);    //call the next class->method to calculate peek hours rat
			
		}
		else if(cabPickUpTime == currentTime)
		{
			System.out.println("       Please wait a minute....   ");
			PeakHours.excessRate(totalgst,cabPickUpTime,distance);   //call the next class->method to calculate peek hours rate
		}
		else if(cabPickUpTime.isBefore(currentTime))
		{
			System.out.println("    Please provide a valid date    ");
			pickUpTime(totalgst,distance);                          //call the same method if date is invalid
		}
	}
	public static void journeyDate(float totalgst,float distance) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the journey date [*yyyy-mm-dd] : ");
		String traveldate=sc.nextLine();   //yyyy-mm-dd                //get date from user
		LocalDate  travelDate= LocalDate.parse(traveldate);
		LocalDate currentDate=LocalDate.now(); 
		if(travelDate.isAfter(currentDate))                            //date should be in current and future
		{
			pickUpTime(totalgst,distance);                         //call the time method if date is valid
			
		}
		else if((travelDate == currentDate))
		{
			pickUpTime(totalgst,distance);                        //call the time method if date is valid
		}
		else if(travelDate.isBefore(currentDate))
		{
			System.out.println("   Please provide a valid date   ");
			journeyDate(totalgst,distance);                      //call the same method if date is invalid
		}
	}

}
