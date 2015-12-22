import java.util.ArrayList;
public class Invoice
{
	private double total = 0.0;
	private boolean hasPet = false;
	private int qu = 0;
	private ArrayList <Item> invoice = new ArrayList<Item>();
	

	public double getDiscount()
	{
		
		for (Item i : invoice)
		{
			if(i.getisPet())
			{
				hasPet = true;
			}	
			else
			{
				qu += i.getQuantity();
				total = total + i.getprice()*i.getQuantity();
			}

			
		}
		
		if (qu >= 5 && hasPet)
		{
			total = total*.2;
		}
		
		return total;
	}
	
	public void add(Item anItem)
	{
		invoice.add(anItem);
	}
	
	public void printInvoice()
	{
		for (Item item: invoice)
		{
			System.out.println(item);
		}
	}
}