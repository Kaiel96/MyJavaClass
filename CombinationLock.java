public class CombinationLock {
	
	private int secret1; 
	private int secret2;
	private int secret3; 
	private int set = 0;
	private int temp1;
	private int temp2;
	private int temp3;
	private int i = 0;

	public CombinationLock(int secret1,int secret2,int secret3){
		this.secret1 = secret1;
		this.secret2 = secret2;
		this.secret3 = secret3;
	}
	public void reset(){
		set = 0; 
	}
	public void TurnRight(int ticks){
		if (i == 0) {
			temp1 = set + ticks;
			i++;
			
		}
		else{
			temp3 = set + ticks-temp2-temp1; 
			i--;
			
		}
	}
	public void TurnLeft(int ticks){
		temp2 = set + ticks-temp1; 
		reset();
	}
	public boolean Open(){
		if (secret1 == temp1 && secret2 == temp2 && secret3 == temp3){
			return true;
		}
		else{
			return false;
			reset();
		}
	}
}
