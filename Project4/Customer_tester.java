import java.util.Scanner;

public class Customer_tester
{
	public static void main (String args[])
	{
		boolean set = true;
		Customer c = new Customer();
		while (set)
		{
			
			Scanner scan = new Scanner(System.in);
			System.out.println("How much was the purchase?");
			Double purchase = scan.nextDouble();
			System.out.println("What was the store number?");
			int store = scan.nextInt();
			while (store<0 || store >22)
			{
				System.out.println("Invalid number. What was the store number?");
				store = scan.nextInt();
			}
			c.makePurchase(purchase,store);
			
			System.out.println("Are you still shopping? true to continue, false to finish");
			set = scan.nextBoolean();
			
		}
		double reward = c.rewards();
		System.out.println("Your rewards is $" + reward);
	}
}