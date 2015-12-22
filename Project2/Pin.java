import java.util.Scanner;

public class Pin 
{
	
	public static void main(String args[])
	{
	int number = 0;
	int i = 0;
	int ans = 0;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter your pin");
	number = in.nextInt();
				
	while (i != 3)
	{
		if (number == 1234)
		{
			System.out.println("Your PIN is correct");
			return;
		}
		else if (number != 1234)
		{
			System.out.println("Your PIN is incorrect");
			i ++;					
			if (i == 3)
			{
				System.out.println("Your bank card is blocked");
				return;
			}
			System.out.println("Enter your pin");
			number = in.nextInt();			
		}
	}	
	}
}

				


