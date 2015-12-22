import java.util.Scanner;
class FactorPrinter
{
	public static void main(String[] args)
	{
		Scanner usr = new Scanner(System.in);
		System.out.println("What number would you like to find the factorization of?: ");
		int number = usr.nextInt(); 
		int[] factors = new int[20];
		int num_factors = 0;
		FactorGenerator x = new FactorGenerator(number);
		
		while (x.hasMoreFactors())
		{
			factors[num_factors]= x.nextFactor();
			num_factors ++;
		}

		System.out.println("The factorization of " + number + " is" );
		for(int i = 0; i < num_factors; i++)
		{
		System.out.println(factors[i]);
		}
	}
}