package com.q1.as5;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;


public class DateTimeConverter {
	public static void main(String[] args) {
		Date date = new Date();
		//String pattern = "dd/MM/yyyy";
		//String pattern = "MM/dd/yyyy";
		//String pattern = "yyyy/MMMM/dd";
		//String pattern = "hh:mm:ss ";
		//String pattern = "hh:mm:ss a";
		//String pattern = "hh:mm ";
		//String pattern = "dd/mm/yyyy hh:mm:ss";
		//String pattern = "mm/dd/yyyy hh:mm:ss a ";
		//String pattern = "yyyy/mm/dd hh:mm";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String strDate = sdf.format(date);
		
		
		System.out.println(strDate);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main1(String[] args) {
		Date date = new Date();
		int day = date.getDate();
		int month = date.getMonth()+1;
		int year = date.getYear()+1900;
		
		System.out.println(day + "/"+month+"/"+year );
		
	}
}
