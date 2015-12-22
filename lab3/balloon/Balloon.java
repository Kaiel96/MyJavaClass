
package balloon;

public class Balloon {
    private double radius;
    private double Volume;

public Balloon()
{
    this.radius = 0;
    this.Volume = 0;
}


public void inflate(double amount)
{
    radius += amount;
}


public double get_volume()
{
   Volume = (4/3.0)*Math.PI*(Math.pow(radius, 3.0));
   return Volume;
}
}


