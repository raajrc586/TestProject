package com.test1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.sun.org.apache.bcel.internal.generic.GETSTATIC;

public class Date_Diff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String date_time_1 = "22-Jul-2019 12:00";
		String date_time_2 = "22-Jul-2019 2:57";
		
		
		
		String dateStart = "01/14/2012 09:29:58";
		String dateStop = "01/15/2012 10:31:48";
//		date_time(dateStart,dateStop);
		date_time(date_time_1,date_time_2);
		
	}

	private static void date_time(String startDate, String endDate) {
		// TODO Auto-generated method stub
		

		//HH converts hour in 24 hours format (0-23), day calculation
		DateFormat format = new SimpleDateFormat("hh:mm:ss a dd-MMM-yyyy");
		String dateStart = format.format(startDate);
		String dateStop = format.format(endDate);
		Date d1 = null;
		Date d2 = null;

		
		try {
			d1 = format.parse(dateStart);
			d2 = format.parse(dateStop);

			//in milliseconds
			long diff = d2.getTime() - d1.getTime();

			long diffSeconds = diff / 1000 % 60;
			long diffMinutes = diff / (60 * 1000) % 60;
			long diffHours = diff / (60 * 60 * 1000) % 24;
			long diffDays = diff / (24 * 60 * 60 * 1000);

			System.out.print(diffDays + " days, ");
			System.out.print(diffHours + " hours, ");
			System.out.print(diffMinutes + " minutes, ");
			System.out.println(diffSeconds + " seconds.");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
