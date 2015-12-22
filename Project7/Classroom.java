public class Classroom {
	private int roomNum;
	private String amenities;
	private int size;
	private boolean reserved = false;
	private int time;
	public Classroom(int roomNum, String amenities,int size, boolean reserved){
		this.roomNum = roomNum;
		this.amenities = amenities;
		this.size = size;
	}
	public int getRoomNum(){
		return roomNum;
	}
	public String getAmenity(){
		return amenities;
	}
	public int getTime(){
		return time; 
	}
	public int getSize(){
		return size;
	}
	public boolean getReserved(){
		return reserved;
	}
}