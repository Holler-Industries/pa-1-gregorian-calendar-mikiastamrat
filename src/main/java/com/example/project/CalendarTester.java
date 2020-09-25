package com.example.project;
import java.util.*;

public class CalendarTester {


    public static void main(String[] args) {
        GregorianCalendar todaydate = new GregorianCalendar(2020, Calendar.SEPTEMBER, 23);

        //This constructs a GregorianCalendar object
        GregorianCalendar myCal = new GregorianCalendar();

        int day = myCal.get(Calendar.DAY_OF_MONTH);
        int month = myCal.get(Calendar.MONTH);
        int year = myCal.get(Calendar.YEAR);
        int dayofweek = myCal.get(Calendar.DAY_OF_WEEK);

        myCal.add(Calendar.DAY_OF_MONTH,100);
        day = myCal.get(Calendar.DAY_OF_MONTH);
        month = myCal.get(Calendar.MONTH);
        year = myCal.get(Calendar.YEAR);
        dayofweek = myCal.get(Calendar.DAY_OF_WEEK);

        GregorianCalendar birthdaycalendar = new GregorianCalendar(2020, Calendar.FEBRUARY, 14);
        myCal.get(Calendar.DAY_OF_WEEK);

        myCal.add(Calendar.DAY_OF_MONTH,10000);
        day = myCal.get(Calendar.DAY_OF_MONTH);
        month = myCal.get(Calendar.MONTH);
        year = myCal.get(Calendar.YEAR);






//Now cal is 10 days from today
//Now cal is 100 days from today


        /* You can use constants with the GregorianCalendar class to refer to its various
         * variables.  For example, "Calendar.MONTH" is a variable that refers to the
         * month of the calendar.  This can be used with the .get() method to test
         * the calendar.  Consider the example:
         * */


//Now cal is 100 days from today

        //Call the .get method on myCal using Calendar.DAY_OF_WEEK as the argument

        System.out.println("myCal Day of Week: " + myCal.get(Calendar.DAY_OF_WEEK));
        System.out.println("Expected: 4");     //Note: 1 = Sunday, 2 = Monday, etc.


        //Write similar tests for month, year and day of month.


        //Call the .add method to add 100 days to myCal.  Then, check the date and weekday of this new date.
        // To see that it is correct, check out this calendar calculator:
        //http://www.timeanddate.com/date/dateadd.html


        //Finally, find what day of the week is 10,000 days after your 2020 birthday. Note, you may have to play around
        //with adding or subtracting days to get to your birthday date (hmm, how can you subtract days?)


    }

}