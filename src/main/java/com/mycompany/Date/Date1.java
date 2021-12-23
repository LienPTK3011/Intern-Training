/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Dang
 */
public class Date1 {
    public static void main(String[] args) throws ParseException {
		
		ex2a();
                ex2b();
                ex2c();
		
		
	}
    
    public static void ex2a() {
		System.out.println("Ex 2    a : ");
		Calendar calendar = Calendar.getInstance();   
	    System.out.println("Current year: " + calendar.get(Calendar.YEAR));
	     if ((calendar.get(Calendar.YEAR) % 4 == 0) && (calendar.get(Calendar.YEAR) % 100 != 0) 
                     || (calendar.get(Calendar.YEAR) % 400 == 0)) 
             {
	    	System.out.println("Year "+calendar.get(Calendar.YEAR)+" is leap year");
	    }else {
	    	System.out.println("Year " +calendar.get(Calendar.YEAR)+" is not leap year");
	    }	   
	    System.out.println("Passed day of year = " + calendar.get(Calendar.DAY_OF_YEAR)+"Days");
	}
    
    
 public static void ex2b() {
  // set the new date format
  DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

  Date currentDate = new Date();
        //Plus 24h
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.add(Calendar.HOUR, 24);

  Date date1 = null;
  Date date2 = null;

  try {
   // calculating the difference b/w startDate and Current date
   String startDate = "2020-12-24 20:40:00";
   String endDate = simpleDateFormat.format(currentDate);

   date1 = simpleDateFormat.parse(startDate);
   date2 = simpleDateFormat.parse(endDate);

   long getDiff = date2.getTime() - date1.getTime();

   // using TimeUnit class from java.util.concurrent package
   long getDaysDiff = TimeUnit.MILLISECONDS.toDays(getDiff);
    System.out.println("Ex 2b : ");
   System.out.println("Differance between date " + startDate + " and " + endDate + " is " + getDaysDiff + " days.");
  } catch (Exception e) {
   e.printStackTrace();
  }
 }
 
 public static void ex2c() throws ParseException {
		System.out.println("Ex 2c : ");
		String stringDate = "24/12/2021";
		Date date3 = new SimpleDateFormat("dd/MM/yyyy").parse(stringDate);
		System.out.println("String: " +stringDate + "=> Datetime: " + date3);
		
	}

}
