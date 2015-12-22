
package balloon;
public class BalloonTester{
    
public static void main(String[] args){
    Balloon ball = new Balloon();
    double oldvol = ball.get_volume();
    double inf = 3;
    ball.inflate(inf);
    double newvol = ball.get_volume();
    
    System.out.println(oldvol);
    System.out.println(inf);
    System.out.println(newvol);
    
}
}
