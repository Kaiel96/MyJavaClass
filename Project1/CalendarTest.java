import java.util.GregorianCalendar;
import java.util.Calendar;

public class CalendarTest 
{
    	public static void main (String[] args)
	{
		GregorianCalendar today = new  GregorianCalendar();
                today.add(GregorianCalendar.DAY_OF_MONTH, 100);
                    int hun_day = today.get(GregorianCalendar.DAY_OF_MONTH);
                    int hun_month = today.get(GregorianCalendar.MONTH);
                    int hun_year = today.get(GregorianCalendar.YEAR);
                    int hun_weekday = today.get(GregorianCalendar.DAY_OF_WEEK);
			
			

		GregorianCalendar bday = new  GregorianCalendar(1996,GregorianCalendar.JANUARY,2);
                bday.add(GregorianCalendar.DAY_OF_MONTH, 1000);
                    int thousand_day = bday.get(GregorianCalendar.DAY_OF_MONTH);
                    int thousand_month = bday.get(GregorianCalendar.MONTH);
                    int thousand_year = bday.get(GregorianCalendar.YEAR);
                    int thousand_weekday = bday.get(GregorianCalendar.DAY_OF_WEEK);
                
                System.out.println("This is the weekday, 2 meaning monday, the day 1000 days from my day of birth");
                System.out.println(thousand_weekday);
                System.out.println("This is the month, 8 meaning September, 1000 days from my day of birth");
                System.out.println(thousand_month);
                System.out.println("This is the year 1000 days from my day of birth");
                System.out.println(thousand_year);
                
                System.out.println("This is the weekday, 3 meaning Tuesday, 100 days from today");
                System.out.println(hun_weekday);
                System.out.println("This is the month, 0 meaning January, 100 days from today");
                System.out.println(hun_month);
                System.out.println("This is the year 100 days from today");
                System.out.println(hun_year);
                
                
                

                
                
                
                
	}
}