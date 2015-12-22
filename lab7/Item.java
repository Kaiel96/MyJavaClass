
public class Item
{
	private double price;
	private boolean isPet;
	private int quantity;

	public Item(double price, boolean isPet, int quantity)
	{
		this.price = price;
		this.isPet = isPet;
		this.quantity = quantity;
	}
	public double getprice()
	{
		return price;
	}
	public boolean getisPet()
	{
		return isPet;
	}
	public int getQuantity()
	{
		return quantity;
	}

	public String toString()
	{
		return quantity + (isPet ? " Pet": " Non-Pet") + ": $" + price + " each.";
	}
}


