package com.selvasankari;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class PeakHours {
	public static void excessRate(float totalgst,LocalTime cabPickUpTime,float distance)
	{
		int hour = cabPickUpTime.getHour();
		//System.out.println("Hour:"+hour);
		if(hour >=17 &&  hour <= 19)                          //peak hour is 4 pm to 6 pm
		{
			float peakHoursRate0=(distance*1.25f)/100 ;   //1.25 % for one Km
			float peakHoursRate=peakHoursRate0 + totalgst;
			System.out.println("PeakHour Amount : " +peakHoursRate0);  
			System.out.println("Total Fare after addition of peakhour Rate : "+peakHoursRate);
			SeniorCitizen.finalAmountCalculation(peakHoursRate);
		}
		
		else
		{
			float peakHoursRate=totalgst;
			SeniorCitizen.finalAmountCalculation(peakHoursRate);    //call the next method to calculate final amount
		}
	}

}
