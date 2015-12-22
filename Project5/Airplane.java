import java.util.ArrayList;
import java.util.Scanner;
public class Airplane
{
	public static void main(String[] args){
		boolean set = false;
		boolean reserved; 
		String seatNumber = "";
		String type;
		String response = "";
		int position = 0;
		int people;
		int i = 0; 
		ArrayList <Seat> seats= new ArrayList <Seat>();
		Scanner scan = new Scanner(System.in);
		First firstClass = new First (seatNumber,position);
		Economy economySeats = new Economy(seatNumber,position);

		for (i = 1; i <= 20 ; i++){
			reserved = false; 
			if (i == 1 || i%4 == 1){
				seatNumber = "A" + i;
				position = 0;
				firstClass = new First(seatNumber,position);
			}
			else if (i == 2|| i%4 == 2){
				seatNumber = "B" + i;
				position = 2;
				firstClass = new First (seatNumber,position);
			}
			else if (i == 3|| i%4 == 3){
				seatNumber = "C" + i;
				position = 2;
				firstClass = new First (seatNumber,position);
			}
			else {
				seatNumber = "D" + i;
				position = 0;
				firstClass = new First (seatNumber,position);
			}
			
			seats.add(firstClass);
		}

		for (i = 21; i <= 110 ; i++){
			reserved = false; 
			if (i%6 == 3){
				seatNumber = "A" + i;
				position = 0;
				economySeats = new Economy(seatNumber,position);
			}
			else if (i%6 == 4){
				seatNumber = "B" + i;
				position = 1;
				economySeats = new Economy(seatNumber,position);
			}
			else if (i%6 == 5){
				seatNumber = "C" + i;
				position = 2;
				economySeats = new Economy(seatNumber,position);
			}
			else if (i%6 == 0){
				seatNumber = "D" + i;
				position = 2;
				economySeats = new Economy(seatNumber,position);
			}
			else if (i%6 == 1){
				seatNumber = "E" + i;
				position = 1;
				economySeats = new Economy(seatNumber,position);
			}
			else {
				seatNumber = "F" + i;
				position = 0;
				economySeats = new Economy(seatNumber,position);
			}
			seats.add(economySeats);
		}

		while (set == false){
			System.out.println("Would you like a first class ticket or an economy class ticket?");
			type = scan.next();
			if (type.equals("first")){
				System.out.println("How many people are reserving a seat, 1 or 2?");
				people = scan.nextInt();
				System.out.println("What type of seat would you like, is it Window: 0 or Aisle: 2?");
				position = scan.nextInt();
				for (Seat f: seats){
					if (f.getPosition() == position && f.isReserved() == false && f instanceof First){
						f.setReserved(true);
						response = "Your prefered seat was found! Your seat is ";
						seatNumber = f.getSeatNum();
						break; 
					}
					else if (f.isReserved() == false && f instanceof First){
						f.setReserved(true);
						response = "Your prefered seat position was not available. The next best seat is";
						seatNumber = f.getSeatNum();
						break;
					}
					else if (f instanceof First){
						response = "Sorry, there aren't any more first class seats.";
						seatNumber = "";
						break; 
					}
				}
			}
			else{
				System.out.println("How many people are reserving a seat, 1, 2 or 3?");
				people = scan.nextInt();
				System.out.println("What type of seat would you like, is it Window: 0, Center: 1, or Aisle: 2?");
				position = scan.nextInt(); 
				for (Seat e: seats){
					if (e.getPosition() == position && e.isReserved() == false && e instanceof Economy){
						e.setReserved(true);
						response = "Your prefered seat was found! Your seat is ";
						seatNumber = e.getSeatNum();
						break;
					}
					else if (e.isReserved() == false && e instanceof Economy){
						e.setReserved(true);
						response = "Your prefered seat position was not available. The next best seat is";
						seatNumber = e.getSeatNum();
						break;
					}
					else if(e instanceof Economy){
						response = "Sorry, there aren't any more economy class seats.";
						seatNumber = "";
						break;
					}
				}
			}
			System.out.println(response + " " + seatNumber);
			System.out.println("Are you done booking? true to end");
			set = scan.nextBoolean();
		}
		
	}
}