import java.util.Scanner;
class tickets
{
	public static void main(String[] args)
	{
		
		Scanner usr = new Scanner(System.in);
		int tixNum = 100;
		int bought = 0;
		int buyers = 0;

		while (tixNum > 0)
		{
			System.out.println("There are " + tixNum + " ticket(s) remaining. How many would you like?");
			bought = usr.nextInt();
			
			if (bought > tixNum)
			{
				System.out.println("Sorry, we don't have that many tickets.");
			}
			else if (bought > 4)
			{
				System.out.println("Sorry, we are only selling 4 tickets to each person");	
			}
			else
			{
				buyers ++;
				tixNum = tixNum - bought;
			}
		}

		System.out.println("All tickets have been sold. There were " + buyers + " people who purchased tickets");
			
	}
}



