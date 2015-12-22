public class Request{

	public void printSchedule(){

	}
	public boolean checkTime(int time){
		if(time >22 || time < 5){
			return false;
		}
		else if (event instanceof Club && time < 17){
			return false;
		}
		else{
			return true;
		}
	}
	public boolean checkEvent(Event event, Classroom classroom){
		if ((event.getAmenities()).equals(classroom.getAmenities())){
			return true;
		}
		else if (checkTime(event.getTime()) &&  !classroom.getReserved()) {
			return false;
		}
		else if (event.getSize() <= class.getSize()){
			return false;
		}
		else{
			return false;
		}
	}
}