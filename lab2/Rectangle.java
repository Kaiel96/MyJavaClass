package Rectangle;
public class Rectangle
{
	public int tlx;
	public int tly;
	public int brx;
	public int bry;

	public Rectangle(int topleftx, int toplefty, int bottomrightx, int bottomrighty)
	{
		this.tlx = topleftx;
		this.tly = toplefty;
		this.brx = bottomrightx;
		this.bry = bottomrighty;
	}

	public Rectangle Intersect(Rectangle r1, Rectangle r2)
	{
			//Case1  corner overlap

			if ( (r2.tly > r1.bry) && (r2.tlx < r1.brx) )
			{
				System.out.println("Case 1");
				Rectangle case1 = new Rectangle(r2.tlx,r2.tly,r1.brx,r1.bry);
				return (case1);
				
			}

			//Case 2 left overlap

			else if((r2.tlx < r1.tlx) && (r2.tly < r1.tly) && (r2.bry > r1.bry) && (r2.brx < r1.brx))
			
			{
				System.out.println("Case2");
				Rectangle case2 = new Rectangle((r1.tlx),(r1.tly - (r1.tly - r2.tly)),(r1.brx),(r1.bry));
				return case2;
			}

			//Case 3 cross formation

			else if ((r2.tlx > r1.tlx) && (r2.tly < r1.tly) && (r2.bry > r1.bry) && (r2.brx > r1.brx))
			{
				System.out.println("Case3");
				Rectangle case3 = new Rectangle((r1.tlx),(r1.tly - (r1.tly - r2.tly)),
				(r1.brx),(r1.tly - (r1.tly - r2.bry)) );
				return case3;
			}

			//Case 4 right overlap

			else if((r2.tlx < r1.tlx) && (r2.tly < r1.tly) && (r2.bry > r1.bry) && (r2.brx < r1.brx))
			{
				System.out.println("Case4");
				Rectangle case4 = new Rectangle( (r2.tlx),(r2.tly),(r1.brx),(r1.tly - (r1.tly - r2.bry)) );
				return case4;
			}


			//Case 5 inside

			else if((r2.tly < r1.tly) && (r2.tlx > r1.tlx) && (r2.brx < r1.brx) && (r2.bry > r1.bry))
			{
				System.out.println("Case5: Rectangle fully inside");
				return r2;
			}

			//Case 6 nada

			else
			{
				System.out.println("Case 6: No Intersect");
				Rectangle case6 = new Rectangle(0,0,0,0);
				return case6;
			}



		
	}

}
