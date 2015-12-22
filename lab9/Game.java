public interface Game
{
	public String moveInput();
	public Boolean isValidMove(String move);
	public void executeMove(String move);
	public Boolean gameOver(String move);
}