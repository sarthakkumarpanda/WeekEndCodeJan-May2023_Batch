package special_Classes_In_Java_13thMay_2023;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

import org.joda.time.LocalDate;

public class Date_Concepts {

	public static void main(String[] args) {

		// Create a new Date Object representing the current date and time
		Date currentDate = new Date();
		System.out.println("The current date is : " + currentDate);

		// int short byte long(which stores highest)
		// epoch time - January 1, 1970, 00:00:00 GMT
		long milliseconds = currentDate.getTime();
		System.out.println("Milliseconds since epoch: " + milliseconds);

		// Get the year, month, day, hour components of a date
		LocalDate currentDate1 = LocalDate.now();
		int year = currentDate1.getYear();
		int month = currentDate1.getMonthOfYear();
		int day = currentDate1.getDayOfMonth();
		System.out.println("Year is :" + year + "--- Month is :" + month + "---- Day is :" + day);

		// Create a LocalTime Object representing the current time
		LocalTime localtime = LocalTime.now();
		int hour = localtime.getHour();
		int minute = localtime.getMinute();
		int second = localtime.getSecond();
		System.out.println("Hour is :" + hour + "--- Minute is :" + minute + "---- Second is :" + second);

		// PastDate
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		Date myDate = new Date(System.currentTimeMillis());
		Date oneDayBefore = new Date(myDate.getTime() - 86400000);
		String dateStr = dateFormat.format(oneDayBefore);
		System.out.println("past date result is :" + dateStr);

		// convert dateStr into integer. Store that in an int value

		// Check if two Dates are equal ??
		Date anotherDate = new Date(milliseconds);
		boolean dateEqualOrNot = currentDate.equals(anotherDate);
		System.out.println("Verifying dates are equal or not :" + dateEqualOrNot);

		// compare two dates
		int comparison = currentDate.compareTo(anotherDate);
		System.out.println("Comparison result is : " + comparison);
		// int comparison1 = currentDate.compareTo(dateStr); //use the int value in row
		// no 45
		// System.out.println("Comparison result is : " + comparison1);

		// check if the current date is after or before a specified date
		boolean isAfter = currentDate.after(anotherDate);
		boolean isBefore = currentDate.before(anotherDate);
		System.out.println("Date is after :" + isAfter);
		System.out.println("Date is before :" + isBefore);

		// How to create copy of the current date object ?
		Date copy = (Date) currentDate.clone();
		System.out.println("Copy of the date is : " + copy);

		// How to set the time represented by the current date object to a specified
		// value
		// Sat May 13 11:23:00 EDT 2023
		long newTime = 1683991537982L;
		currentDate.setTime(newTime);
		System.out.println("The new time is :" + currentDate);

		// how to convert the current date Object to an instant Object
		Instant instant = currentDate.toInstant();
		System.out.println("The instant object is : " + instant);

		// How to convert current date object to a String
		String dateString = currentDate.toString();
		System.out.println("The string format date is : " + dateString);
		
		System.out.println("---------------------------------------------------------");
		// A Date Object which will represent a specific date and format the same
		// Create the Object of Calendar class

		// created a Calendar Object and set it to January 26, 2022
		Calendar calendar = Calendar.getInstance();
		calendar.set(2022, Calendar.JANUARY, 26);

		// create a Date Object from this Calendar Object
		Date newYear = calendar.getTime();

		// format the date as "MM/dd/yyy" - create the Object of SimpleDateFormat class
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("MM/dd/yyyy");
		String dateString1 = dateFormat1.format(newYear);

		// display the formatted date
		System.out.println("The formatted date is: " + dateString1);

		System.out.println("-------------------------------------------------------------");

		// Adding a certain number of days to a Date Object and display the result
		Calendar calendar1 = Calendar.getInstance();
		calendar1.setTime(new Date()); //it will set the Calendar to today's date
		
		//add 1 week to the calendar
		calendar1.add(Calendar.DAY_OF_YEAR, 7);
		Date added1WeekDate = calendar1.getTime();
		
		//format the added1WeekDate as 
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("EEEE, MMMM, dd, yyyy");
		String dateString2 = dateFormat2.format(added1WeekDate);
		
		//display date in desired format
		System.out.println("One week added date is : " + dateString2);

	}

}
