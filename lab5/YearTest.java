import java.util.Scanner;
class YearTest
{

	public static void main(String args[])
	{
		Scanner userInput = new Scanner(System.in); 
		System.out.println("Enter a year to check if it is a leap year:");
		int year = userInput.nextInt();
		Year year1 = new Year(year);
		boolean leapCheck = year1.isLeapyear(year);
		
		if (leapCheck)
		{
			System.out.println("That IS a leap year!");
		}
		else
		{
			System.out.println("That IS NOT a leap year!");
		}
		System.out.println(leapCheck);
	}
}