import java.util.Scanner;

public class petShopTester
{
	public static void main(String args[])
	{
		Scanner use = new Scanner(System.in);
		Invoice inv = new Invoice();
		Boolean finished = true;

		while (finished)
		{ 
			
			System.out.println("Is it a pet? Please respond true or false");
				boolean isP = use.nextBoolean();
			System.out.println("Enter the price of the item.");
				double p = use.nextDouble();
			System.out.println("Enter the quantity of the item");
				int q = use.nextInt();
			System.out.println("Are there any items left? If no more items, enter false. Else, enter true");
				finished = use.nextBoolean();
			Item i = new Item(p,isP,q);
			
			inv.add(i);
		}
		System.out.println("You saved $" + inv.getDiscount());
		inv.printInvoice();
		//discount.printInvoice();
	}
}