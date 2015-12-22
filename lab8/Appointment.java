import java.util.GregorianCalendar;
import java.util.ArrayList;


public class Appointment
{
	private String description;
	private GregorianCalendar date = new GregorianCalendar ();
	  

	public Appointment(String description, GregorianCalendar date)
	{
		this.description = description;
		this.date = date;
	}
	public String getDescrip()
	{
		return description;
	}
	public GregorianCalendar getDate()
	{
		return date;
	}


	boolean occursOn(int year,int month, int day)
	{
		if (year == date.get(GregorianCalendar.YEAR) && month == date.get(GregorianCalendar.MONTH) && 
			day == date.get(GregorianCalendar.DAY_OF_MONTH))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}