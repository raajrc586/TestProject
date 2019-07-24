package com.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
String date_time_2 = "24-Jul-2019 2:57 AM";
String date_time_1 = "22-Jul-2019 12:00 AM";

getTime(date_time_1);

//String date_time_3 = "2019-07-17T06:46:520Z";
//String date_time_4 = "2019-07-16T05:46:520Z";




//System.out.println("Date 3 : "+getDate(date_time_3));
//System.out.println("Time 3 : "+getTime(date_time_3));


//float laborHours = getDateDiff(date_time_1,date_time_2);
//System.out.println("Labor Hours : "+laborHours);
	}

	private static float getDateDiff(String sodDate, String eodDate) {
		// TODO Auto-generated method stub
//		String diff=null;
		float labHrs=0;
		Date startDate = new Date(sodDate);
		Date endDate = new Date(eodDate);
		
		System.out.println("Start Date : "+startDate);
		System.out.println("End Date : "+endDate);
		DateFormat format = new SimpleDateFormat("yyyy-MMM-dd hh:mm:ss");
		
		Date d1 = null;
		Date d2 = null;

		
		try {
			d1 = startDate;
			d2 = endDate;

			//in milliseconds
			long diff = d2.getTime() - d1.getTime();

			long diffSeconds = diff / 1000 % 60;
			float diffMinutes = diff / (60 * 1000) % 60;
			long diffHours = diff / (60 * 60 * 1000) % 24;
			long diffDays = diff / (24 * 60 * 60 * 1000);

			float diffMinutes1 = diff / (60 * 1000) % 60;
			labHrs= (diffDays * 24) + diffHours + (diffMinutes / 60);
			
//			System.out.println("Long Labor Hours : "+labHrs);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return labHrs;
	}

	private static String getTime(String date_time) {
		// TODO Auto-generated method stub
		int timeVal=0;
		int dateVal = 0;
		if(date_time.contains("AM")) {
			dateVal = date_time.trim().lastIndexOf("");
//			System.out.println("Date Length : "+dateVal);
		}
		else {
			dateVal= date_time.trim().lastIndexOf(" ");
//			System.out.println("Date Length : "+dateVal);
		}
		
		if(date_time.contains("."))
		{
//			timeVal = date_time.trim().lastIndexOf(".");
			timeVal = date_time.lastIndexOf(".");
		}
		else if(date_time.contains("Z"))
		{
//			timeVal = date_time.trim().lastIndexOf("Z");
			timeVal = date_time.lastIndexOf("Z");
			
		}
		else {
//			timeVal = date_time.trim().length();
			timeVal = date_time.length();
//			System.out.println("Time Length : "+timeVal);
		}
		String time = date_time.trim().substring(dateVal+1,timeVal);
		System.out.println("Time in Method: "+time);
		return time;
	}

	private static String getDate(String date_time) {
		// TODO Auto-generated method stub
		int dateVal = 0;
		if(date_time.contains("T")) {
			dateVal = date_time.trim().lastIndexOf("T");
//			System.out.println("Date Length : "+dateVal);
		}
		else {
			dateVal= date_time.trim().lastIndexOf(" ");
//			System.out.println("Date Length : "+dateVal);
		}
		String date = date_time.trim().substring(0, dateVal);
//		System.out.println("Date In Method: "+date);
		return date;
	}

}
