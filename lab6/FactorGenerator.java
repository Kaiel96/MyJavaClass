class FactorGenerator
{
	private int numberToFactor;

	FactorGenerator(int numberToFactor)
	{
		this.numberToFactor = numberToFactor;
	}
	
	public Boolean hasMoreFactors()
	{
		
			if (numberToFactor > 1)
			{

				return true;
			}
			else
			{
				return false;
			}
	}

	public int nextFactor()
	{
		
		for(int i=2;i<=numberToFactor;i++)
		{
			if (numberToFactor%i == 0)
			{
				numberToFactor = numberToFactor/i;
				return i;
			}
		}
		return 0;
		
	}

}