import java.util.Scanner;
public class LockTester{
	public static void main(String[] args){
		CombinationLock lock = new CombinationLock(15,24,5);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter att1"); 
		int s1 = scan.nextInt();
		System.out.println("Enter att2"); 
		int s2 = scan.nextInt();
		System.out.println("Enter att3"); 
		int s3 = scan.nextInt();
		lock.TurnRight(s1);
		lock.TurnLeft(s2);
		lock.TurnRight(s3);
		boolean bool = lock.Open();
		if (bool){
			System.out.println("Its open");
		}
		else{
			System.out.println("Its closed");
		}

	}
}