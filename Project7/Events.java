public class Events{
	private String amenities;
	private int time;
	private int priority;
	public Events(String amenities,int time,int priority){
		this.amenities = amenities;
		this.time = time;
		this.priority = priority;
	}
	public String getAmenity(){
		return amenities;
	}
	public int getTime(){
		return time; 
	}
	public int getPriority(){
		return priority;
	}
}