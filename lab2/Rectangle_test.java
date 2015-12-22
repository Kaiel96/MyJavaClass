public class Rectangle_test
{
	public static void main(String[] args)
	{
		Rectangle r1 = new Rectangle(0,2,2,0);
		System.out.println (r1.tlx);
		System.out.println (r1.tly);
		System.out.println (r1.brx);
		System.out.println (r1.bry);
		Rectangle r2 = new Rectangle(1,3,3,1);
		Rectangle intr = new Intersect(r1,r2);
	}
}