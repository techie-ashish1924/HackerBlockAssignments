import java.util.*;

public class K_Knight_Problem {
	static int count = 0;
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		boolean board[][] = new boolean[n][n];
		positions_func(board, n, -1);
		System.out.println("\n" + count);
    }

	public static void positions_func(boolean[][] board, int n, int leno){
		if(n == 0){
			count++;
			display_func(board);
			return;
		}
		for (int i = leno + 1; i< board.length * board.length; i++) {
		int row = i / board.length;
		int col = i % board.length;

			if (!board[row][col] && isSafe_func(board, row, col)) {
			board[row][col] = true;
			positions_func(board, n-1, row * board.length + col);
			board[row][col] = false;
			}
		}
		
	}

	public static boolean isSafe_func(boolean[][] board, int row, int col){
		if(row - 2 >= 0 && col - 1 >= 0 &&  board[row-2][col-1])
		return false;

		if(row - 1 >= 0 && col - 2 >= 0 &&  board[row - 1][col - 2])
		return false;

		if(row - 1 >= 0 && col + 2 < board.length &&  board[row - 1][col + 2])
		return false;

		if(row - 2 >= 0 && col + 1 < board.length &&  board[row - 2][col + 1])
		return false;

		return true;

	}

	public static void display_func(boolean[][] board){
		for(int x = 0; x < board.length; x++){
			for(int y = 0; y < board[0].length; y++){
				if(board[x][y])
				System.out.print("{" + x + "-" + y + "} ");
			}

		}
		System.out.print(" ");
	}
}