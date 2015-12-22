public class Seat{
	private String seatnumber;
	private boolean reserved = false;
	private int position; 

	public Seat(String seatnumber, int position){
		this.seatnumber = seatnumber;
		this.position = position;
	}
	public String getSeatNum(){
		return seatnumber;
	}
	public int getPosition(){
		return position;
	}
	public boolean isReserved(){
		return reserved;
	}
	public void setReserved(boolean reserved){
		this.reserved = reserved;
	}
}
