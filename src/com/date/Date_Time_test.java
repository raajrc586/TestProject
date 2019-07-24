package com.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Time_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String date_time_2 = "24-Jul-2019 2:57 PM";
		String date_time_1 = "22-Jul-2019 12:00 AM";

		
		String time = getTime(date_time_1);
		
		System.out.println("TIME : "+getTime(date_time_2));
		
		getDateDiff(date_time_1, date_time_2);
	}
	private static String getTime(String date_time) {
		// TODO Auto-generated method stub
		int timeVal=0;
		int dateVal = 0;
		String pst = null;
		
			dateVal= date_time.trim().indexOf(" ");
			System.out.println("Date Length : "+dateVal);
		
		
		if(date_time.contains("AM"))
		{
//			timeVal = date_time.trim().lastIndexOf(".");
			timeVal = date_time.lastIndexOf("AM");
			pst = " AM";
		}
		else if(date_time.contains("PM"))
		{
//			timeVal = date_time.trim().lastIndexOf("Z");
			timeVal = date_time.lastIndexOf("PM");
			pst = " PM";
		}
		
		String time = date_time.trim().substring(dateVal+1,timeVal);
		System.out.println("Time in Method: "+time);
		
		
		return time+pst;
	}
	
	

	private static String getDate(String date_time) {
		// TODO Auto-generated method stub
		int dateVal = 0;
		if(date_time.contains(" ")) {
			dateVal = date_time.trim().indexOf(" ");
//			System.out.println("Date Length : "+dateVal);
		}
		
		String date = date_time.trim().substring(0, dateVal);
		System.out.println("Date In Method: "+date);
		return date;
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
			
			System.out.print(diffDays + " days, ");
			System.out.print(diffHours + " hours, ");
			System.out.print(diffMinutes + " minutes, ");
			System.out.println(diffSeconds + " seconds.");
			System.out.println("Long Labor Hours : "+labHrs);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return labHrs;
	}

}
