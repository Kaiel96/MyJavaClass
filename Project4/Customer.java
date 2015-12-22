import java.util.ArrayList;
class Customer
{
	private double total = 0;
	private double rewards = 0;
	private double currP = 0;
	private int storeCount = 0;

	private ArrayList <Double> purchases = new ArrayList<Double>();
	private ArrayList <Integer> stores = new ArrayList<Integer>();

	public void makePurchase(double amount, int store)
	{
		total += amount;
		purchases.add(amount);
		if (! stores.contains(store))
		{
			stores.add(store);
		}
	}

	public boolean discountReached()
	{
		int tot = (int) total;
		if (tot/100 >= 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean storeCheck()
	{	
		return stores.size()>= 3;
	}

	public double rewards()
	{
		int tot = (int) total;
		if (discountReached() && storeCheck())
		{
			rewards = 10 * tot/100;
			return rewards;
		}
		return 0;
	}
}