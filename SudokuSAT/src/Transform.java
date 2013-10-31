
//Transform will take in a 9x9 2D array Sudoku Board
//and transform it and conditions for solving it into
//Conjunctive Normal Form so that it can be fed
//to a SAT Solver
public class Transform {
	public static void main(String[] args)
	{

		//Rows of Sudoku Board
		final int ROW = 9;	
		//Columns of Sudoku Board
		final int COLUMN = 9;

		//2D array that will hold the Sudoku board
		int board[][] = new int[ROW][COLUMN];

		Input(ROW, COLUMN);
		

		

		
	
	}
	//Input will take in a string that represents a
	//Sudoku Board and turns it into a 2D array
	//of rows by columns
	private void Input(int R, int C)
	{
			
		for(int i =0; i < R; i++)
		{
			for (int j =0;j < C; j++)
			{
			}
		}
	}
	
}