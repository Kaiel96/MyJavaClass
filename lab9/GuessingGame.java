import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
import java.util.ArrayList; 

public class GuessingGame implements Game {
	
	private Scanner scan = new Scanner(System.in);
	private int secretNumber = (int) (Math.random() * 99 + 1);
	private int player = 1;
	private ArrayList <Integer> list = new ArrayList<Integer>();

	public int getPlayer(){
		return player; 
	}
	public String moveInput(){
		System.out.println("Player " + player + " Enter a number between 1 and 100");
		int num = scan.nextInt();
		list.add(num);
		String move = "" + num; 
		return move;
	}
	public Boolean isValidMove(String move){
		int mover = Integer.parseInt(move);
		if (mover >= 1 || mover <= 100){
			return true;
		}
		else{
			return false; 
		}

	}
	public void executeMove(String move){
		if (isValidMove(move) && player == 1){
			player = 2; 
		}
		else if (isValidMove(move) && player == 2){
			player = 1; 
		}
	}
	public void playerMove(){
	}
	public Boolean gameOver(String move){
		int mover = Integer.parseInt(move);
		if ( mover == secretNumber){
			player = player - 1;
			return false; 
		}
		else{
			return true; 
		}
	}
	public void boardPrinter(){
		for(int i:list)
		System.out.println(i);
	}
}

