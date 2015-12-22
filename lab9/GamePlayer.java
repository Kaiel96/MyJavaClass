import java.util.Scanner;
public class GamePlayer
{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		boolean set = true;
		boolean set2 = true;
		System.out.println("What game would you like to play? tic or guess?");
		String game = scan.next();

		if (game == "tic"){
			TicTac tic = new TicTac();
			while (set){
				System.out.println("This is the current map");
				tic.boardPrinter();
				String move = tic.moveInput();
				tic.executeMove(move);
				set = tic.gameOver(move);
			}
			System.out.println("Game over. Winner is player " + tic.getPlayer());
		}
		else{
			GuessingGame guess = new GuessingGame();
			System.out.println("Welcome to the guessing game");
			while (set2){
				System.out.println("This is the current map");
				guess.boardPrinter();
				String move = guess.moveInput();
				guess.executeMove(move);
				set2 = guess.gameOver(move);
			}
			System.out.println("Game over. Winner is player " + guess.getPlayer());
		}
	}
		
}