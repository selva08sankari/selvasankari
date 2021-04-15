package com.selvasankari;

public class GstCalculation {
	public static void gst(float total,float distance)
	{
		float gst=(total*7)/100;
		float totalgst = gst+total;
		System.out.println("GST amount : " +gst);
		System.out.println("Total Fare : "+totalgst);
		Booking.journeyDate(totalgst,distance);
	}
}
