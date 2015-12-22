import java.util.Scanner;
import java.util.ArrayList;

public class TicTac implements Game {
	private Scanner scan = new Scanner(System.in);
	private char[][] spaces = new char [3][3];
	private int player = 1;

	public String moveInput(){
		System.out.println("Player " + player + " Enter your row, 0, 1, or 2"); 
		int row = scan.nextInt(); 
		System.out.println("Enter your column, 0, 1, or 2");
		int column = scan.nextInt();
		String move  = "" + row + column;
		return move;
	}
	public int getPlayer(){
		return player; 
	}

	public Boolean isValidMove(String move){
		int row =Integer.parseInt("" + move.charAt(0));
		int column =Integer.parseInt("" + move.charAt(1));
		if (  (row < 3 && column < 3) && ( (spaces[row][column] != 'X' && spaces[row][column] != 'O') )  ){
			return true;
		}
		else{
			System.out.println("Invalid move, try again");
			return false;
		}
	}
	public void executeMove(String move){
		int row =Integer.parseInt("" + move.charAt(0));
		int column =Integer.parseInt("" + move.charAt(1));
		if (isValidMove(move)){
			if (player == 1) {
				spaces[row][column] = 'X';
				player = 2;
			}
			else{
				spaces[row][column] = 'O';
				player = 1;
			}
		}
	}
	public Boolean gameOver(String move){
		if (spaces[0][0] == 'X' && spaces[0][1] == 'X' && spaces[0][2] == 'X'){
			player = player - 1;
			return false;

		}
		else if(spaces[0][0] == 'O' && spaces[0][1] == 'O' && spaces[0][2] == 'O'){
			player = player - 1;
			return false;
		}
		else if (spaces[1][0] == 'X' && spaces[1][1] == 'X' && spaces[1][2] == 'X'){
			player = player - 1;
			return false;
		}
		else if(spaces[1][0] == 'O' && spaces[1][1] == 'O' && spaces[1][2] == 'O'){
			player = player - 1;
			return false;
		}
		else if (spaces[2][0] == 'X' && spaces[2][1] == 'X' && spaces[2][2] == 'X'){
			player = player - 1;
			return false;
		}
		else if(spaces[2][0] == 'O' && spaces[2][1] == 'O' && spaces[2][2] == 'O'){
			player = player - 1;
			return false;
		}
		else if (spaces[0][0] == 'X' && spaces[1][0] == 'X' && spaces[2][0] == 'X'){
			player = player - 1;
			return false;
		}
		else if(spaces[0][0] == 'O' && spaces[1][0] == 'O' && spaces[2][0] == 'O'){
			player = player - 1;
			return false;
		}
		else if (spaces[0][1] == 'X' && spaces[1][1] == 'X' && spaces[2][1] == 'X'){
			player = player - 1;
			return false;
		}
		else if(spaces[0][1] == 'O' && spaces[1][1] == 'O' && spaces[2][1] == 'O'){
			player = player - 1;
			return false;
		}
		else if (spaces[0][2] == 'X' && spaces[1][2] == 'X' && spaces[2][2] == 'X'){
			player = player - 1;
			return false;
		}
		else if(spaces[0][2] == 'O' && spaces[1][2] == 'O' && spaces[2][2] == 'O'){
			player = player - 1;
			return false;
		}
		else if (spaces[0][0] == 'X' && spaces[1][1] == 'X' && spaces[2][2] == 'X'){
			player = player - 1;
			return false;
		}
		else if(spaces[0][0] == 'O' && spaces[1][1] == 'O' && spaces[2][2] == 'O'){
			player = player - 1;
			return false;
		}
		else if (spaces[0][2] == 'X' && spaces[1][1] == 'X' && spaces[2][0] == 'X'){
			player = player - 1;
			return false;
		}
		else if(spaces[0][2] == 'O' && spaces[1][1] == 'O' && spaces[2][0] == 'O'){
			player = player - 1;
			return false;
		}
		else{
			return true;
		}
	}
	public void boardPrinter(){
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
			System.out.print(spaces[i][j]);
			}
			System.out.println("");
		}
	}
	//public static void main(Strings[])
}