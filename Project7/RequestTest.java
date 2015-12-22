import java.util.Scanner;
import java.util.ArrayList; 
public class RequestTest{
	public static void main(String[] args){
		boolean asset = true;
		boolean real = true;
		Scanner scan = new Scanner(System.in);
		ArrayList<Classroom> available = new ArrayList<Classroom>(5);
		Classroom c1 = new Classroom(101,"Projector",20,false);
		Classroom c2 = new Classroom(102,"Whiteboard",100,false);
		Classroom c3 = new Classroom(103,"Chalkboard",15,false);
		Classroom c4 = new Classroom(104,"Whiteboard",40,false);
		Classroom c5 = new Classroom(105,"Whiteboard",50,false);
		available.add(c1);
		available.add(c2);
		available.add(c3);
		available.add(c4);
		available.add(c5);

		System.out.println("What type of orginization are you? Please specify one of the following: Club, Seminar, Guest Speaker, Class");
		String type = scan.next();
		System.out.println("What amenities do you need? Please specify one of the following: Chalkboard, Whiteboard, Projector");
		String amenity = scan.next();
		System.out.println("What time do you need the room?");
		int time = scan.nextInt();
		
		if (type.equals("Club")){
			Club event = new Club("Club", amenity, time,4);
			}
		else if (type.equals("Seminar")){
			Seminar event = new Seminar("Seminar",amenity,time,3);
		}
		else if (type.equals("Guest Speaker")){
			GuestSpeaker event = new GuestSpeaker("Guest Speaker",amenity,time,2);
		}
		else{
			Class event = new Class("Class",amenity,time,1);
		}


	
		for (Classroom classroom: available){
			
			while (asset){
				//checkEvent(event,classroom)
				if(1 == 1){
					//classroom.reserved = true;
					System.out.println("The classroom with the attributes you want is available. The room is " + classroom.getRoomNum());
					asset = false;	
				}
				else{
				System.out.println("The classroom you want is unavailable.");
				}
			}
			
		}
	}
	
}