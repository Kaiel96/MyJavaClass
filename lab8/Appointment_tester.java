import java.util.Scanner; 
import java.util.GregorianCalendar;
import java.util.ArrayList;

public class Appointment_tester
{
	
	public static void main(String args[])
	{
		ArrayList <Appointment> dates = new ArrayList<Appointment>(); 
		Scanner scan = new Scanner(System.in);
		Boolean run = true;
		int day; 
		int year;
		int month;
		
		while (run)
		{
			System.out.println("What is the day of the appointment you want to add?");
			day = scan.nextInt();
			System.out.println("What is the month of the appointment you want to add? eg: JANUARY");
			month = scan.nextInt();
			System.out.println("What is the year of the appointment you want to add?");
			year = scan.nextInt();
			System.out.println("What is the description of the appointment you want to add?");
			String description = scan.next();
			System.out.println("Is there another date to add? true if more, false if no more");
			run =  scan.nextBoolean();
			GregorianCalendar date = new GregorianCalendar(day,month,year);
			dates.add(new Appointment(description,date));
		}

		System.out.println("What is the day of the appointment you want to check?");
		day = scan.nextInt();
		System.out.println("What is the month of the appointment you want to check?");
		month = scan.nextInt();
		System.out.println("What is the year of the appointment you want to check?");
		year = scan.nextInt();
		GregorianCalendar date = new GregorianCalendar(day,month,year);

		for (Appointment i: dates)
		{
			if (date.equals(i.getDate()))
			{
				System.out.println(i.getDescrip());
			}
		}
	}
}