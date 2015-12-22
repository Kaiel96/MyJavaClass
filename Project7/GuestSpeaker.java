public class GuestSpeaker extends Events{
	private String description;
	private String amenities;
	private int time;
	private int priority;
	public GuestSpeaker(String description,String amenities,int time,int priority){
		super(amenities,time,priority);
		this.description = description;
	}
	public String getAmenity(){
		return amenities;
	}
	public int getTime(){
		return time; 
	}
	public int getSize(){
		return priority;
	}
	public String getDescription(){
		return description;
	}
}