package com.selvasankari;

public class GstCalculation {
	public static void gst(float total,float distance)
	{
		float gst=(total*7)/100;                                 //calculate GST amount
		float totalgst = gst+total;                              //Add the GST amount and total amount
		System.out.println("GST amount : " +gst);
		System.out.println("Total Fare : "+totalgst);            
		Booking.journeyDate(totalgst,distance);                  //call the next class->method to know date and time
	}
}
